package com.Industrialstudio.general

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val seekerButton = findViewById<ImageView>(R.id.seekerButton)
        val workerButton = findViewById<ImageView>(R.id.workerButton)
        val versionText = findViewById<TextView>(R.id.InformationText)

        //..................Logging........................
        seekerButton.setOnClickListener {
            val intent: Intent = Intent(
                this@MainActivity,
                SeekerLogin::class.java
            )
            startActivity(intent)
        }

        workerButton.setOnClickListener {
            val intent: Intent = Intent(
                this@MainActivity,
                WorkerLogin::class.java
            )
            startActivity(intent)
        }
        //..................register........................

        versionText.setOnClickListener {
            val intent: Intent = Intent(
                this@MainActivity,
                VersionInformation::class.java
            )
            startActivity(intent)
        }
    }
}