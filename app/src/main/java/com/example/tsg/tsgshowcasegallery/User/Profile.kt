package com.example.tsg.tsgshowcasegallery.User

class Profile {
    private var name: String? = null

    private var surname: String? = null
    private var age: Int? = null
    private var profession: String? = null
    private val nameOfApp: String? = "TSG Showcase Gallery"

   // var getName : String? get () = name



    var getFullName: String? = ""
        private set
        get () = "$name $surname"


}
