package day1

fun main() {

    /*자바와 동일*/
    if (10 is Int){
        println("is Int")
    }else{

    }

    /*비교연산자를 사용한 방법*/
    if(10 is Int && !("test" is String)){
        println("there is true")
    }else{
        println("there is false")
    }

    println("---------------------")
    doWhen(1)
    doWhen("test")
    doWhen(true)
    doWhen(10000L)
}

fun doWhen(a:Any){
    when(a){
        1 -> println("is 1")
        "test" -> println("is test")
        is String -> println("is string")
        true -> println("is true")
    }
}