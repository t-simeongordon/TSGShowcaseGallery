package com.example.tsg.tsgshowcasegallery

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.tsg.tsgshowcasegallery.Tester.ProfileDetails
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun showPageDetailsGetterSetterTrials(view: View){
        val intent = Intent(this, ProfileDetails::class.java)
       // intent.putExtra("key", value)
        startActivity(intent)
    }
}