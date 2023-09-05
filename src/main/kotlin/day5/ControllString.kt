package day5

fun main() {
    var test1 = "Test.Kotlin.java"

    println(test1.length)
    println(test1.toLowerCase())
    println(test1.toUpperCase())

    val testArr = test1.split(".")
    println(testArr.size)
    var testArr2 = test1.split("t")
    println(testArr2.size)

    println()
    println(testArr.joinToString("-"))
    println(testArr.joinToString())

    println(test1.subSequence(0,10))
    println("====================================")
    var nullString : String? = null
    val emptyString = ""
    val blankString = " "
    val nobalString = "d"
    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(nobalString.isNullOrEmpty())
    println()

    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(nobalString.isNullOrBlank())
    println("====================================")
    var test3 = "kotlin.kt"
    var test4 = "java.java"

    println(test3.startsWith("java"))
    println(test4.startsWith("java"))
    println(test3.endsWith("java"))
    println(test4.endsWith("java"))
    println(test3.contains("lin"))
    println(test4.contains("lin"))

}