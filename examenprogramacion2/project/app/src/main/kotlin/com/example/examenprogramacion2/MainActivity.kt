package com.example.examenprogramacion2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configura un texto simple como contenido
        val textView = TextView(this).apply {
            text = "¡Hola, esta es la app del examen de Programación 2!"
            textSize = 24f
            setPadding(40, 200, 40, 40)
        }

        setContentView(textView)
    }
}
