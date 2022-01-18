package com.example.birthdaygreet

import android.media.MediaParser
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_birthdaywish.*
import kotlinx.android.synthetic.main.activity_main.*


class Birthdaywish : AppCompatActivity() {
    companion object
    {
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaywish)
        val mediaplayer=MediaPlayer.create(this,R.raw.song)
        mediaplayer.isLooping = false
        mediaplayer.start()

        val name=intent.getStringExtra(NAME_EXTRA)
        myTextView.text="Happy Birthday\n $name!"
    }
}