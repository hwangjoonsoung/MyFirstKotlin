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

    /*
    반복문의 제어 참고
    다음 반복문을 보면 0~10까지 반복이다. 그러면 0이 스타트 이기 때문에
    0을 변수로 지정하면 start를 변수로 제어가 가능하다.
     var start = 2
     var end = 10
     for (i in start..end) {
            println("i : "+ i)
            result2+=i
        }
    여기서 보면 i는 그냥 초기화임으로 Int의 default인 0부터 시작이다.
     */


}