package day2

fun main() {

    var basicclass = BasicClass("hwang",1993)
    var basicclass2 = BasicClass("kim",2003)
    var basicclass3 = BasicClass("park",2421)

    basicclass.hello()
    basicclass2.hello()
    basicclass3.hello()
}

class BasicClass (var name : String , var birthYaer : Int){
    var realName : String = name
    var realBirthYear : Int = birthYaer

    fun hello(){
        println("안녕하세요 저는 ${birthYaer}년생 ${name} 입니다.")

    }
}
/*
클래스는 이와 같은 타입으로 만들어 진다.
class [class name](constructor) : [return type]{
    [field variable]
    [functions]
}
 */