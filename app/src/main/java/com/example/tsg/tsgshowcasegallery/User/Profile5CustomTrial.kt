package com.example.tsg.tsgshowcasegallery.User

class Profile5CustomTrial{
private var firstName: String? = "ty"
private var lastName: String? = "bella"
var name: String
    get() = firstName + " " + lastName
    set(value) {
        val nameArray = value.split(" ".toRegex())
        firstName = nameArray[0]
        lastName = nameArray[1]
    }

    fun setFirstName(firstName:String){

        this.firstName=firstName
    }

    fun setLastName(lastName:String){

        this.lastName=lastName
    }
}