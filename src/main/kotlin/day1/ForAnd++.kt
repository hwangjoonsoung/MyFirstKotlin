package day1

fun main() {

    var i :Int = 0
    while ( i < 10){
        println(i++)
    }
    var j :Int = 10
    while (j > 0){
        println(j--)
    }

    /*====================*/
    var k : Int = 0;
    for (k in 0..9 step 2){
        println("for : " + k)
    }

    var l : Int = 10;
    for(l in 9 downTo 1 step 2){
        println("for down : " + l)
    }

    /*이거 안된다 step에는 무적권 양수가 와야 한다.
    for (k in 9..0 step -2){
        println("for : " + k)
    }*/


}