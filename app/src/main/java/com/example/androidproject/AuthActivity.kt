package com.example.androidproject

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_auth)

        val userLogin: EditText = findViewById(R.id.user_login_auth)
        val userPass: EditText = findViewById(R.id.user_pass_auth)
        val button: Button = findViewById(R.id.butto_auth)
        val linkToReg: TextView = findViewById(R.id.link_to_reg)


            linkToReg.setOnClickListener{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        button.setOnClickListener{
            val login = userLogin.text.toString().trim()
            val pass = userPass.text.toString().trim()

            if(login == ""  || pass == "")
                Toast.makeText(this, "Не все поля заполнены", Toast.LENGTH_SHORT).show()
            else {
                val db = DBhelperv(this, null)
                val isAuth = db.getUser(login, pass)

                if(isAuth) {
                    Toast.makeText(this, "Пользователь $login авторизован", Toast.LENGTH_SHORT).show()
                    userLogin.text.clear()
                    userPass.text.clear()

                    val intent = Intent(this, ItemsActivity::class.java)
                    startActivity(intent)
                } else
                    Toast.makeText(this, "Пользователь $login не автозизован", Toast.LENGTH_SHORT).show()

            }
        }
    }

}