package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_leagueactivity.*

class leagueactivity : basicactivity() {
    var selectedleague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leagueactivity)
    }

    fun mensclicked(view: View) {
        womensbtn.isChecked = false
        co_edbtn.isChecked = false
        selectedleague = "mensbtn"
    }

    fun womensclicked(view: View) {
        mensbtn.isChecked = false
        co_edbtn.isChecked = false
        selectedleague = "womensbtn"
    }

    fun coedclicked(view: View) {
        mensbtn.isChecked = false
        womensbtn.isChecked = false
        selectedleague = "co-edbtn"
    }


    fun leaguenextclick(view: View) {
        if (selectedleague != "") {
            val skillactivity = Intent(this, skillactivity::class.java)
            skillactivity.putExtra(EXTRA_LEAGUE, selectedleague)
            startActivity(skillactivity)
        } else {
            Toast.makeText(this, "please select a league", Toast.LENGTH_SHORT).show()
        }
    }
}
