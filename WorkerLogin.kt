package com.Industrialstudio.general

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WorkerLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worker_login)

        val seekerLoginButton = findViewById<ImageView>(R.id.seekerLoginButton)
        val editTextPhone = findViewById<TextView>(R.id.editTextPhone)
        val error= findViewById<TextView>(R.id.error)
        val Terms = findViewById<CheckBox>(R.id.Terms)

        error.visibility = View.INVISIBLE

        seekerLoginButton.setOnClickListener {
            if (editTextPhone.text.toString().isNotBlank() && Terms.isChecked )
            {
                val intent: Intent = Intent(
                    this@WorkerLogin,
                    OTP1::class.java
                )
                startActivity(intent)
            }else{
                error.visibility = View.VISIBLE
            }
        }
    }
}