package day6
/*

?. : null 인지 확인 후 뒤에 있는 구문을 실행 안함

?: : null이 아니라면 그대로 사용하지만 null이라면 지정한 값을 부여한다

!!. : null여부를 컴파일시 확인하지 않도록 하여 runtime시 NPE를 의도하는 것
*/

fun main() {
    var a : String? = null
/*    println(a?.toUpperCase()) // null
    println(a?:"default".toUpperCase()) //DEFALUT
    println(a!!.toUpperCase()) // NPE발생*/

    a?.run {
        println(toUpperCase())
        println(toUpperCase())
    }
    a = "test"
    a?.run {
        println(toUpperCase())
        println(toUpperCase())
    }
}