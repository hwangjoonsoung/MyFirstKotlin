package day2

open class Animal(var name: String, var age: Int, var type: String) {
    init {
        println("이룸 : $name 나이 : $age 타입 : $type")
    }

    open fun bark(){
        println("wtf?")
    }
}

/*
상속의 조건
1. 서브클레스는 슈퍼클레스의 변수명을 사용할 수 없다
2. 서브클레스가 인스턴스화 되면 슈퍼클레스의 생성자까지 호출되어야 한다.
 */

class Dog(name: String, age: Int) : Animal(name, age, "Dog") {
    init {
        println("이룸 : $name 나이 : $age 타입 : $type")
    }
    
    override fun bark(){
        println("멍멍")
    }
}

fun main() {
    var dog = Dog("hwnag", 20);  //init을 하게 되면 자동적으로 같이 호출이 된다.
    dog.bark()
    var nothing = Animal("hwnag", 20, "cat");
    nothing.bark()
}