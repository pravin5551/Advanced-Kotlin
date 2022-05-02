package com.example.advancekotlin

class HigherOrderFun {


}

fun main() {
    higherOrder(5.0, 6.0, ::add)
}


fun add(a: Double, b: Double): Double {
    return a + b;
}

fun higherOrder(a: Double, b: Double, fn: (Double, Double) -> Double) {
    print(fn(a, b))
}