package day1

import kotlin.reflect.typeOf

//    var : 읽기 쓰기 가능한 변수 선언
//    val : final 속성 가진 변수 선언

fun main() {
    /*Int-------------------------------*/
    //var a : Int =null //이게 안된다. nullable이 아니기 때문이다.
    var intB : Int //이게 안된다. nullable이 아니기 때문이다.
    var intC : Int? =null //이건 nullable 하기 때문에 선언 가능
    intB=10
    println("intB : "+intB)
    println("intC : "+intC)

    /*char-------------------------------*/
    //다른것은 전부 자바와 같지만 자료형 char의 경우 특이하다.
    //코틀린은 utf-16을 지원하기 때문에 2byte를 사용한다.
    var charA : Char ='A'
    var nullCharB : Char? = null
    println("charA : "+charA)
    println("nullCharB : "+nullCharB)

    /*string-------------------------------*/
    var stringA  = "string A"
    var nullStringB : String? = null
    println("stringA : "+stringA)
    println("stringA type : "+ stringA is String)
    println("nullStringB : "+nullStringB)

    /*boolean-------------------------------*/
    var booleanA : Boolean = true;
    println("booleanA : " + booleanA)

    /*궁금한거 javascript 처럼 char + int하면 어떻게 될까?*/
     var intFirst = 10;
     var stringSecond = "10";
     var charthired = "1";
    println(stringSecond+charthired+intFirst)
    println(stringSecond+charthired+intFirst is String)
    println(stringSecond+charthired)
//    println(intFirst+charthired) 이거 안된다. int + string , int + char 안됨 컴파일 오류 발생
//    당연하게 string + int = string
}