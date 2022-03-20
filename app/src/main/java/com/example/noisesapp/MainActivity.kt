package com.example.noisesapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var btnClicked : Button?= null
    private var noise: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun NoiseProduce (view : View?){
        when((view as Button)?.text.toString()){
            "1" ->{
                    noise = MediaPlayer.create(this, R.raw.fart1)
                    noise?.start()
                  }
            "2" ->{
                    noise = MediaPlayer.create(this, R.raw.fart2)
                    noise?.start()
                   }
            "3" ->{
                noise = MediaPlayer.create(this, R.raw.fart3)
                noise?.start()
            }
            "4" ->{
                noise = MediaPlayer.create(this, R.raw.bark1)
                noise?.start()
            }
            "5" ->{
                noise = MediaPlayer.create(this, R.raw.bark2)
                noise?.start()
            }
            "6" ->{
                noise = MediaPlayer.create(this, R.raw.bark3)
                noise?.start()
            }
            "7" ->{
                noise = MediaPlayer.create(this, R.raw.raven)
                noise?.start()
            }
            "8" ->{
                noise = MediaPlayer.create(this, R.raw.lion)
                noise?.start()
            }
            "9" ->{
                noise = MediaPlayer.create(this, R.raw.horse2)
                noise?.start()
            }
            "10" ->{
                noise = MediaPlayer.create(this, R.raw.horse)
                noise?.start()
            }
            "11" ->{
                noise = MediaPlayer.create(this, R.raw.crow)
                noise?.start()
            }
            "12" ->{
                noise = MediaPlayer.create(this, R.raw.birds)
                noise?.start()
            }
            else ->
            {
                noise = MediaPlayer.create(this, R.raw.baby_scream)
                noise?.start()
            }
        }
    }
}