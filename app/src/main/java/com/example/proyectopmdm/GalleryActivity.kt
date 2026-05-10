package com.example.proyectopmdm
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GalleryActivity : AppCompatActivity() {

    private var currentImage = 0

    private val images = arrayOf(
        R.drawable.foto1,
        R.drawable.foto2,
        R.drawable.foto3
    )

    private val names = arrayOf(
        "Interstellar",
        "Avengers",
        "Batman"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        val imageMovie = findViewById<ImageView>(R.id.imageMovie)
        val txtMovie = findViewById<TextView>(R.id.txtMovie)
        val btnChange = findViewById<Button>(R.id.btnChange)

        btnChange.setOnClickListener {

            currentImage++

            if (currentImage >= images.size) {
                currentImage = 0
            }

            imageMovie.setImageResource(images[currentImage])
            txtMovie.text = names[currentImage]
        }
    }
}