package com.example.advancekotlin

class Infix {

    /**
     * Infix notation in Kotlin

    Functions marked with the infix keyword can also be called using the infix notation (omitting the dot and the parentheses for the call).

    Infix functions must satisfy the following requirements:

    - They must be member functions or extension functions;
    - They must have a single parameter;
    - The parameter must not accept the variable number of arguments and must have no default value.
     */


    // https://www.facebook.com/mindorks.nextgen/posts/infix-notation-in-kotlinfunctions-marked-with-the-infix-keyword-can-also-be-call/1906137586191012/
}

fun main() {
    infix fun Int.add(value: Int): Int = this + value

    //without infix
    val sum = 5.add(10)

    //with infix
    val sum2 = 5 add 10
}




