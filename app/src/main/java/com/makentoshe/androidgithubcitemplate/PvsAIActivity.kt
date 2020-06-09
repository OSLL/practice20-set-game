package com.makentoshe.androidgithubcitemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.player_vs_ai.*
import kotlinx.android.synthetic.main.set_game_2_players.*

class PvsAIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.player_vs_ai)

        val player1: Player = Player("blue", Player.PlayerState.PASSIVE)
        val player2: Player = Player("red", Player.PlayerState.PASSIVE)


        buttonSet.setOnClickListener {
            playerTimer2p(player1, player2)

        }

    }
}
