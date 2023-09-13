package day6

/*
내용의 동일성 : 서로 다른 주소값에 같은 내용의 데이터가 있으면 동일성이 있다 라고 판단하는 것.
객체의 동일성 : 서로 다른 변수가 메모리상에 같은 주소를 가르키고 있을때 판단하는 것
 */

fun main() {

    var a = Product("콜라" , 10000)
    var b = Product("콜라" , 10000)
    var c = a
    var d = Product("사이다" , 1000)
    println(a == b) // 내용의 동일성 확인
    println(a === b) // 객체의 동일성 확인

    println(a == c) // 내용의 동일성 확인
    println(a === c) // 객체의 동일성 확인

    println(a==d) // 내용의 동일성 확인
    println(a===d) // 객체의 동일성 확인
}

class Product(val name : String , val price : Int){
    override fun equals(other: Any?): Boolean {
        if(other is Product){
            return other.name == name && other.price == price
        }else{
            return false;
        }
    }
}