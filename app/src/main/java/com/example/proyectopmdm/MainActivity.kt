package com.example.proyectopmdm
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGallery = findViewById<Button>(R.id.btnGallery)
        val btnAudio = findViewById<Button>(R.id.btnAudio)
        val btnVideo = findViewById<Button>(R.id.btnVideo)

        // pantalla de galería
        btnGallery.setOnClickListener {
            startActivity(Intent(this, GalleryActivity::class.java))
        }

        // pantalla de audio
        btnAudio.setOnClickListener {
            startActivity(Intent(this, AudioActivity::class.java))
        }

        // pantalla de   vídeo
        btnVideo.setOnClickListener {
            startActivity(Intent(this, VideoActivity::class.java))
        }

        }
    }
