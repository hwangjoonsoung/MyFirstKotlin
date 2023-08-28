package day1

/*일반 형태*/
fun add(a: Int , b:Int , c:Int) : Int {
    var result : Int;
    result = a+b+c
    return result
}

/*return 자료형 생략 가능*/
fun add2 (a : Int , b :Int , c : Int ) = a+b+c

fun main() {
    var result = add(1,2,3)
    println(result)

    result = add2(10,20,30)
    println(result)

}