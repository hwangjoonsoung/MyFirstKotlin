package day5

/*
list 는 자바와 동일하게 순서대로 데이터를 넣을 수 있는 공간이다.
kotlin은 List의 구현체가 2개 있는데 list와 MutableList가 있다.
List는 생성시 넣은 객체를 대체 추가 삭제 할수 없지만
MutableList는 가능하다.
*  */

fun main() {
    val a = listOf("사과" , "딸기" , "포도")

    for(fruit in a ){
        println(fruit)
    }

    println()
    var b  = a.toMutableList()
    b.shuffle()
    b.add("수박")
    for(fruit in b ){
        println(fruit)
    }
    b.sort()
    println()
    for(fruit in b ){
        println(fruit)
    }
}