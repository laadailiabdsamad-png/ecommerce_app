
package com.example.myapplication
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator)
        var res = findViewById<TextView>(R.id.textView)
        var button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            var resultat = findViewById<TextView>(R.id.textView)>(R.id.textView))
            res = res + "1"
            resultat.text = res
        }



    }

}