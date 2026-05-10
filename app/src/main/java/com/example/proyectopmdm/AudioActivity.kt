package com.example.proyectopmdm
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AudioActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_audio)

        mediaPlayer = MediaPlayer.create(this, R.raw.music)

        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val btnPause = findViewById<Button>(R.id.btnPause)
        val btnStop = findViewById<Button>(R.id.btnStop)

        // Reproducir audio
        btnPlay.setOnClickListener {

            mediaPlayer.start()
        }

        // Pausar audio
        btnPause.setOnClickListener {

            if (mediaPlayer.isPlaying) {

                mediaPlayer.pause()
            }
        }

        // Detener audio
        btnStop.setOnClickListener {

            if (mediaPlayer.isPlaying) {

                mediaPlayer.stop()

                mediaPlayer = MediaPlayer.create(this, R.raw.music)
            }
        }
    }

    // Evitar que el audio siga sonando
    override fun onStop() {

        super.onStop()

        if (mediaPlayer.isPlaying) {

            mediaPlayer.pause()
        }
    }

    override fun onDestroy() {

        super.onDestroy()

        mediaPlayer.release()
    }
}