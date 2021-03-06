package com.makentoshe.androidgithubcitemplate

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        buttonRules.setOnClickListener {
            val intentRules = Intent(this, RulesActivity::class.java)
            startActivity(intentRules)
        }

        buttonAI.setOnClickListener {
            val intentAI = Intent(this, PvsAIActivity::class.java)
            startActivity(intentAI)
        }

        val colors = arrayOf("g", "r", "p")
        val shapes = arrayOf("r", "o", "w")
        val fillings = arrayOf("e", "f", "s")
        val quantities = arrayOf(1, 2, 3)
        val field = Field()

        val a = mutableListOf<Card>()
        for(color in colors) {
            for(shape in shapes) {
                for(filling in fillings) {
                    for(quantity in quantities) {
                        val card = Card(color, shape, filling, quantity)
                        a.add(card)
                        println()
                        val img = this.resources?.getDrawable(this.resources.getIdentifier(card.filename(), "drawable", this.packageName))
                        card.cardImage = img
                    }
                }
            }
        }
    }
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

    var cardImage: Drawable? = null
    var isChosen: Boolean = false


    fun filename(): String {
        return "$color$shape$filling$quantity"
    }
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
