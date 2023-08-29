package day2;

fun main() {
    var test = ClassConstructor("test" , 1002);
    var test2 = ClassConstructor("test3" , 1002);
    var test3 = ClassConstructor("test3" , 1002);
    var test4 = ClassConstructor("test3" );
}
public class ClassConstructor(var name : String , var year : Int ) {
    var realName = name;
    var realYear = 1993;


    init {
        println(this.name  + " : "+ this.year)
    }

    /*
    보조 생성자 
    생성자를 지정할때 default 값을 지정하고 특정 상황에서만 생성자를 통해서 값을 입력할 때 사용
     */
    constructor(name:String) : this(name , 1993){
        println("this is constructor")
    }
    /*
   test : 보조생성사를 사용하지 않고 필드 변수를 이용한 방법은 불가능 한가?
   할 수 없다. => 조건이 인스턴스화를 진행했을때 필드 변수에 입력이 가능해야 함으로
   init의 실행문에 name 과 year을 둘다 입력하게 되면 인스턴스화 할때 둘다 입력 해야 하는 상황이 발생한다.
    */
}
