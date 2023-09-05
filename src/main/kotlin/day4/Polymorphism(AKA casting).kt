package day4

class Polymorphism {
}

open class Drink{
var name = "Drink"
    open fun drink(){
        println("$name 을 마십니다")
    }

}

class Cola : Drink() {
    var type = "cola"
    override fun drink() {
        println("$name 중에 ${type}을 마십니다")
    }
    fun washDishes(){
        println("$type 을 설거지 합니다")
    }

}

fun main() {
    var a = Drink()
//    a.drink()
    /*
    여기서 보면 Drink로 up casting을 했기 때문에 Drink에 있는 함수만 사용할 수 있다.
    물론 하위 클레스를 인스턴스화 했기 때문에 함수는 하위 클레스로 사용된다.
    */
    var b:Drink = Cola()
    b.drink()

    /*
    is를 사용해서 다운케스팅 할 수 있따.
    is는 조건문을 통해 다운케스팅이 가능하다
    */
    if(b is Cola){
        b.washDishes();
    }
    /*
    as를 이용해서 다운케스팅을 할 수 있다.
    as를 사용하면 b도 마찬가지로 다운케스킹이 되기 때문에 참조 오류가 발생하지 않는다.
     */
    var c = b as Cola;
    c.washDishes()
    b.washDishes()
}