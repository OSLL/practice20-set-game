package com.makentoshe.androidgithubcitemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.set_game_2_players.*
import kotlinx.android.synthetic.main.set_game_4_players.*

class CardField4pActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.set_game_4_players)

        val player1: Player = Player("blue", Player.PlayerState.PASSIVE)
        val player2: Player = Player("red", Player.PlayerState.PASSIVE)
        val player3: Player = Player("green", Player.PlayerState.PASSIVE)
        val player4: Player = Player("yellow", Player.PlayerState.PASSIVE)

        buttonSet_left_bottom.setOnClickListener {
            playerTimer4p(player1, player2, player3, player4)

        }

        buttonSet_left_up.setOnClickListener {
            playerTimer4p(player2, player1, player3, player4)

        }

        buttonSet_right_bottom.setOnClickListener {
            playerTimer4p(player3, player2, player1, player4)

        }

        buttonSet_right_up.setOnClickListener {
            playerTimer4p(player4, player2, player3, player1)

        }



    }
}