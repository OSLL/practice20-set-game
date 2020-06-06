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

/*
card: color shape quantity filling isChosen
field: cardInDeck[] cardOnField[] player[]
player: color score playerStatus(active, passive, locked) timeLeft cardInHand[] isCorrect difficulty(time, %of mistake)
*/

public class Card {
    var color: String = "red, green, purple"
    var shape: String = "rhombus, oval, wave"
    var filling: String = "full, stripped, empty"
    var quantity: Int = -1 // 1, 2 or 3
    var isChosen: Boolean = false
}

public class Field {
    var cardInDeck: Array<Card> = arrayOf()
    var cardOnField: Array<Card> = arrayOf()
    var player: Array<Player> = arrayOf()
}

public class Player {
    var color: String = "red, green, blue, yellow"
    var playerStatus: String = "active, passive, locked"
    var score: Int = -1
    var timeLeft: Float = -1f
    var cardInHand: Array<Card> = arrayOf()
    var isCorrect: Boolean = false
    public class difficulty {
        var timeToFind: Float = -1f
        var chanceOfMistake: Float = -1f
    }
}
