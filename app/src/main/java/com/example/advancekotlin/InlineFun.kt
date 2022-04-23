package com.example.advancekotlin

/**
 * Higher Order Functions and Inline.
 */
class InlineFun {
}

fun main() {
    /*
    An inline fun is declared with a keyword inline.
    The use of inline fun enhances the performance of higher order function.
    The inline fun tells the compiler to copy parameters and fun to call site
     */

    inlineFunction { print("Inside main") }

    inlineFunction { print("Inside main") }

    inlineFunction { print("Inside main") }
/*
It creates single instances of with inline , without inline it creates many instances of same variable
 */
}

inline fun inlineFunction(fn: () -> Unit) {
    fn()
    print("Code inside Inline Function")
}