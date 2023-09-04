package day3
var result : Int =0

fun a(str: String) {
    println(str + "함수 a")
}

fun b(function: (String) -> Unit) {
    function("B 함수가 호출")
}

fun main() {
//    b(::a)

    var c: (String) -> Unit = { s: String -> print("test : " + s) }
    c("zzzz")

    var result2 :Int
    var test: (Int) -> Int = { i2: Int ->
        result2 = i2
        for (i in i2..10) {
            println("i : "+ i)
            result2+=i
        }
        result2
    }
    println(test(10))

}

fun testFun(int2: Int): Int {

    return result;
}
/*
고차함수 : 파라미터에 함수의 리턴을 사용하는 방법

 */