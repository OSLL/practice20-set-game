package com.makentoshe.androidgithubcitemplate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.main_menu.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

        button2p.setOnClickListener {
            val intent2p = Intent(this, CardField2pActivity::class.java)
            startActivity(intent2p)
        }

        button4p.setOnClickListener {
            val intent4p = Intent(this, CardField4pActivity::class.java)
            startActivity(intent4p)
        }

        buttonAI.setOnClickListener {
            val intentAI = Intent(this, PvsAIActivity::class.java)
            startActivity(intentAI)
        }

    }
}
