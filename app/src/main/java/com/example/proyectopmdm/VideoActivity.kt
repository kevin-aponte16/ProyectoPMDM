package com.example.proyectopmdm
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class VideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_video)

        val videoView = findViewById<VideoView>(R.id.videoView)

        // Ruta del vídeo
        val videoPath =
            "android.resource://" + packageName + "/" + R.raw.video

        val uri = Uri.parse(videoPath)

        videoView.setVideoURI(uri)

        // Controles multimedia
        val mediaController = MediaController(this)

        mediaController.setAnchorView(videoView)

        videoView.setMediaController(mediaController)

        // Iniciar vídeo
        videoView.start()
    }
}