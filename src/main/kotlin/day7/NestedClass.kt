package day7

class Outer{
    var test = "Outer class"
    inner class Inner{
        fun intro(){
            println("Inner Class")
        }
        fun introOuter(){
            println(this@Outer.test)
        }
    }

    class NestedClass{
         fun intro(){
             println("Nested Class")
         }
/*      접근 할 수 없다
        fun introOuter(){
            println(this@Outer.test)
        }*/
    }
}

fun main() {
    var outer = Outer()
    var inner = outer.Inner()

/*    Outer().Inner().intro();
    Outer().Inner().introOuter();
    Outer.NestedClass().intro();*/
    outer.test = "change text"
    outer.Inner()
    inner.introOuter()
    inner.intro()

    //nest class에 접근할 떄에는 아래와 같이 접근 해야 한다.
    Outer.NestedClass().intro();
}
/*
nested class는 nested class를 감싸고 있는 class에 있는 필드 값에 접근할 수 없다.
하지만 중첩 클레스의 경우 접근 할 수 있다.
즉, 여기서 의미 하는것은 class의 scope가 다르다는 뜻이다.
 */

