package com.example.practice2

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    lateinit var imagewyu : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        imagewyu = findViewById(R.id.imagewyu)

        val image = intent.getIntExtra("PICTURE", 0)
        imagewyu.setImageResource(image)

    }
}

