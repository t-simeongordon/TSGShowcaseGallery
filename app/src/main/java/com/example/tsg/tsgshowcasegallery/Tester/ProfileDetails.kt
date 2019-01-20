package com.example.tsg.tsgshowcasegallery.Tester

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tsg.tsgshowcasegallery.R
import com.example.tsg.tsgshowcasegallery.User.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.profile_display_activity.*

class ProfileDetails : AppCompatActivity() {
val P3 = "P3 Custom"
val P4 = "P4 Private Setter"
    val P5 = "P5 Custom trial"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_display_activity)

       // changeValueOfProperty()
      //  mimicJavaGetterSetter()
        customGetFullName()

    }

    fun useBasicGetterSetter(){
        var user = Profile2basic()
        user.name="ty"
        user.surname="jones"
        user.age=100
        user.address="SE14 5OP"

        //can not concatenate when setting text must call string resources
        //https://stackoverflow.com/questions/33164886/android-textview-do-not-concatenate-text-displayed-with-settext
        user_name_tv.text = getString((R.string.returnUsersName), user.name)
        user_surname_tv.text = getString((R.string.returnUsersSurname), user.surname)
        user_age_tv.text = getString((R.string.returnUsersAge), userAge(user).toString())
        user_address_tv_resource.text = getString((R.string.returnUsersAddress), user.address)
    }

    fun changeValueOfProperty(){

        //sees no effect is dealt to the getter and setters which were called
        //the numbers stay the same if they are not the same value

        //conditions seem to be met when numbers are the same for actual age and age
        //more research needed for why age doe not change by itself


            val maria = Profile3Custom()
            maria.actualAge = 35
            maria.age = 35
            println("Maria: actual age = ${maria.actualAge}")
            println("Maria: pretended age = ${maria.age}")

        Log.d(P3, "Maria: actual age = ${maria.actualAge}")
        Log.d(P3,"Maria: pretended age = ${maria.age}")

        Log.e(P3, "Maria: actual age = ${maria.actualAge}")
        Log.e(P3,"Maria: pretended age = ${maria.age}")

        Log.i(P3, "Maria: actual age = ${maria.actualAge}")
        Log.i(P3,"Maria: pretended age = ${maria.age}")

            val angela = Profile3Custom()
            angela.actualAge = 45
            angela.age = 45
            println("Angela: actual age = ${angela.actualAge}")
            println("Angela: pretended age = ${angela.age}")

        Log.e(P3, "Angela: actual age = ${angela.actualAge}")
        Log.e(P3,"Angela: pretended age = ${angela.age}")
    }

    fun mimicJavaGetterSetter() {
        var p = Profile4Person()
        println("Name of the person is ${p.name}")
        Log.e(P4, "Name of the person is ${p.name}")
                Log.e(P4, "Name of the person is ${p.someProperty}")
        p.foo("Jhon Doe")
        p.someProperty="jamal troyt"
        println("Name of the person is ${p.name}")
        Log.e(P4, "Name of the person is ${p.name}")
        Log.e(P4, "Name of the person is ${p.someProperty}")
    }

    fun customGetFullName(){
        var p = Profile5CustomTrial()
        p.setFirstName("hannah")
        p.setLastName("jahaz")

        Log.e(P5,"NAME: ${p.name}")

        // Log.e(P5,"NAME: ${p.name}")
        //Log.e(P5,"SURNAME: ${p.surname}")

    }

    fun userAge(p:Profile2basic):Int?{
       return p.age
    }
}
