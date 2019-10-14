package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : basicactivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startbtn.setOnClickListener {
            val leagueIntent = Intent(this, leagueactivity::class.java)
            startActivity(leagueIntent)
        }
    }
}






