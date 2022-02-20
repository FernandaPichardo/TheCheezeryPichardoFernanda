package pichardo.fernanda.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import pichardo.fernanda.thecheezery.R.id.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var buttonCold: Button = findViewById(button_cold_drinks) as Button
        var buttonHot: Button = findViewById(button_hot_drinks) as Button
        var buttonSweets: Button = findViewById(button_sweets) as Button
        var buttonSalties: Button = findViewById(button_salties) as Button


        buttonCold.setOnClickListener {
            var intent: Intent = Intent(this, ProductsActivity::class.java)
            startActivity(intent)
        }

        buttonHot.setOnClickListener {
            var intent1: Intent = Intent(this, ProductsActivity::class.java)
            startActivity(intent1)
        }

        buttonSweets.setOnClickListener {
            var intent2: Intent = Intent(this, ProductsActivity::class.java)
            startActivity(intent2)
        }

        buttonSalties.setOnClickListener {
            var intent3: Intent = Intent(this, ProductsActivity::class.java)
            startActivity(intent3)
        }

    }
}