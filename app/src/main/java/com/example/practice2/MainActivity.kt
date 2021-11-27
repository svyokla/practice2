package com.example.practice2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var editext: EditText
    lateinit var batn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editext = findViewById(R.id.editext)
        batn = findViewById(R.id.batn)
        var intent = Intent(this, SecondActivity::class.java)

        batn.setOnClickListener {
            var tekst = editext.text.toString()
            if (tekst == "1") {
                intent.putExtra("PICTURE", R.drawable.pokemosh1)
                startActivity(intent)
            } else if(tekst == "2"){
                intent.putExtra("PICTURE", R.drawable.pokemosh2)
                startActivity(intent)
            } else if(tekst == "3"){
                intent.putExtra("PICTURE", R.drawable.pokemosh3)
                startActivity(intent)
            } else {
                Toast.makeText(this, "анвневк", Toast.LENGTH_LONG).show()
            }

        }
    }
}

