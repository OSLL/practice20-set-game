package com.makentoshe.androidgithubcitemplate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.set_game_2_players.*

class CardField2pActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.set_game_2_players)
        val player1: Player = Player("blue", Player.PlayerState.PASSIVE)
        val player2: Player = Player("red", Player.PlayerState.PASSIVE)


        buttonSet_left.setOnClickListener {
            playerTimer2p(player1, player2)

        }

        buttonSet_right.setOnClickListener {
                playerTimer2p(player2, player1)
        }

    }
}