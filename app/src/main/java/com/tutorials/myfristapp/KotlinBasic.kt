package com.tutorials.myfristapp

fun main() {
    var daiki = Person("daiki", "nishimura")
}

class Person(firstName: String, lastName: String) {
    init {
//        println("Person created")
        println("Initialized a new Person object with" +
            "firstName = $firstName and lastName = $lastName")
    }
}