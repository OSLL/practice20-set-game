package com.makentoshe.androidgithubcitemplate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.chrisbanes.photoview.PhotoView


class RulesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)
        val photoView = findViewById<PhotoView>(R.id.photo_view)
        photoView.setImageResource(R.drawable.set_rules)
    }
}