package com.makentoshe.androidgithubcitemplate
import android.os.CountDownTimer

fun playerTimer2p(showingPlayer: Player, waitingPlayer: Player){
    showingPlayer.status = Player.PlayerState.ACTIVE
    waitingPlayer.status = Player.PlayerState.LOCKED
    var isFinished: Boolean = false

    val timer = object: CountDownTimer(5000, 1000) {
        override fun onTick(millisUntilFinished: Long) {
            println("seconds remaining: " + millisUntilFinished / 1000)
        }


        override fun onFinish() {
            //some function checking if set is correct
            if (!showingPlayer.isCorrect){
                showingPlayer.score-= 1
            }
            else {
                showingPlayer.score+= 1
            }
      //      println("score =" + showingPlayer.score + " color: " + showingPlayer.color)
            showingPlayer.status = Player.PlayerState.PASSIVE
            waitingPlayer.status = Player.PlayerState.PASSIVE
        }
    }

    timer.start()

}

fun playerTimer4p(showingPlayer: Player, waitingPlayer1: Player, waitingPlayer2: Player, waitingPlayer3: Player){
    showingPlayer.status = Player.PlayerState.ACTIVE
    waitingPlayer1.status = Player.PlayerState.LOCKED
    waitingPlayer2.status = Player.PlayerState.LOCKED
    waitingPlayer3.status = Player.PlayerState.LOCKED
    var isFinished: Boolean = false

    val timer = object: CountDownTimer(5000, 1000) {
        override fun onTick(millisUntilFinished: Long) {
            println("seconds remaining: " + millisUntilFinished / 1000)
        }


        override fun onFinish() {
            //some function checking if set is correct
            if (!showingPlayer.isCorrect){
                showingPlayer.score-= 1
            }
            else {
                showingPlayer.score+= 1
            }
          //  println("score =" + showingPlayer.score + " color: " + showingPlayer.color)
            showingPlayer.status = Player.PlayerState.PASSIVE
            waitingPlayer1.status = Player.PlayerState.PASSIVE
            waitingPlayer2.status = Player.PlayerState.PASSIVE
            waitingPlayer3.status = Player.PlayerState.PASSIVE
        }
    }

    timer.start()

}


