package day2

import day1.Variable

abstract class OverridingAndAbstract() {
    abstract fun nameAndYear(name: String , year: Int)
    abstract fun sniff()

}

class FactoryClass() : OverridingAndAbstract(){
    override fun nameAndYear(name: String , year: Int) {
        println(name + year)
    }

    override fun sniff() {
        println("킁킁")
    }

}

fun main() {
    var test = FactoryClass();
    test.nameAndYear("dog" , 220)
    test.sniff()

    var tess = Variable();

}