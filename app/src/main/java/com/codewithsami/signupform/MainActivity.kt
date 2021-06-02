package com.codewithsami.signupform


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.signupActivityBtn)
        button.setOnClickListener { val intent = Intent(this, Signup_Form::class.java)
        startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.loginBtn)
        button2.setOnClickListener { val intent = Intent(this, LoginFormActivity::class.java)
            startActivity(intent)
        }

    }
}