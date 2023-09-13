package day6


fun main() {
//    read(1)
//    read("1")

//    delivertItem("tester" , 222 , "사무실")
//    delivertItem("tester" ) //default argument 사용
//    delivertItem("tester" , destination = "시골" , count = 100) //named argument 사용 : paremet의 이름에 직접 데이터를 적용하는것 이는 파라미터의 순서 변경을 할 수 있다.

//    sum(1,2,3,4,5,6,7,8,9,10)

        println(6 multiply 4)
        println(6.multiply(4) )
}
infix fun Int.multiply(x:Int) :Int = this*x
// 가변 파라미터는 가장 마지막에 위치해야 한다.
fun sum(vararg numbers : Int ){
    var result : Int =0;
    for (n in numbers){
        result += n
    }
    println(result) ;
}

fun read(x: Int) {
    println("숫자 $x 입니다")
}

fun read(x: String) {
    println("문자 $x 입니다")
}

fun delivertItem(name:String , count:Int = 1 , destination : String = "집"){

    println("$name 이 $count 개를 $destination 에 배달했습니다 ")
}