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


        val colors = arrayOf("g", "r", "p")
        val shapes = arrayOf("r", "o", "w")
        val fillings = arrayOf("e", "f", "s")
        val quantities = arrayOf("1", "2", "3")
        var card: Field
        //var i: Int = 0
        for (i in 3 downTo 0) {
            for (j in 3 downTo 0) {
                for (ji in 3 downTo 0){
                    for (ij in 3 downTo 0) {
                        when() {
                             = "green"
                        }
                    }
                }
            }
        }
    }
        /*colors.forEach { card.color ->
            shapes.forEach {

            }
        }*/
}

/*
card: color shape quantity filling isChosen
field: cardInDeck[] cardOnField[] player[]
player: color score playerStatus(active, passive, locked) timeLeft cardInHand[] isCorrect difficulty(time, %of mistake)
*/

public class Card (var color: String, var shape: String, var filling: String, var quantity: Int) {
    /*
    var color: String = "red, green, purple"
    var shape: String = "rhombus, oval, wave"
    var filling: String = "full, stripped, empty"
    var quantity: Int = -1 // 1, 2 or 3
    */
    var isChosen: Boolean = false
}

public class Field {
    var cardInDeck: Array<Card> = arrayOf()
    var cardOnField: Array<Card> = arrayOf()
    var player: Array<Player> = arrayOf()
}

public class Player(var color: String, var playerStatus: String) {
    var score: Int = -1
    var timeLeft: Float = -1f
    var cardInHand: Array<Card> = arrayOf()
    var isCorrect: Boolean = false
    public class difficulty {
        var timeToFind: Float = -1f
        var chanceOfMistake: Float = -1f
    }
}
