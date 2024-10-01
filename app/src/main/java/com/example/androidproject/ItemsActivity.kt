package com.example.androidproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_items)

            val itemsList: RecyclerView = findViewById(R.id.itmsList)
            val items = arrayListOf<Item>()

            items.add(Item(1, "kit","Стильная", "Современная кухня характеризуется простотой и минимализмом", "Этот стиль отличается четкими линиями, гладкими поверхностями и использованием современных высокотехнологичных материалов. Кухни в современном стиле часто оснащены встраиваемой бытовой техникой, что обеспечивает максимальную функциональность и комфорт при приготовлении еды. Простота и лаконичность дизайна позволяют сохранить максимум пространства, а правильные геометрические формы и эргономичность линий создают удобную рабочую зону.",  102310))
            items.add(Item(2, "pul","Современная", "Кухня в Стиле Лофт", "Кухня в стиле лофт сочетает промышленный и современный дизайн, что идеально подходит для больших пространств. Этот стиль характеризуется использованием грубых материалов, ярких цветов и индустриального дизайна мебели. Кухни в стиле лофт часто включают открытые конструкции, металлические элементы и современную бытовую технику. Такой дизайн создает уникальную и стильную атмосферу, которая подчеркивает функциональность и современность.1",  30320))
            items.add(Item(3,"put","Скандинавская","Скандинавская кухня известна своей натуральностью и минималистичным дизайном","Этот стиль отличается светлыми оттенками и использованием натуральных материалов, таких как дерево. Скандинавский дизайн мебели характеризуется простотой и функциональностью, что делает его идеальным выбором для небольших кухонь. Светлые тона и минималистичный подход помогают сохранить ощущение простора и создают уютную атмосферу.",20011))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = itemsAdapter(items, this)
    }
}