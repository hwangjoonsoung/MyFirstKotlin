package day3

var a = "scope1"
class Scope {
    var a = "scope 2"
    fun print(){
        println(a)
    }
}

fun main() {
    var a = "main scope"
    println(a)
    Scope().print();
}

/*
접근제한자.
public , internal , private , protected

1. package에서 사용하는 경우
public : 어디든지 접근 가능
internal : 같은 모듈 내에서만 접근 가능
private : 같은 파일 내에서 접근 가능
2. class에서 사용하는 경우
public : 모든 클레스 접근 가능
private : 해당 클레스 에서만 접근 가능
protected : private + 상속받은 class 에서 접근 가능
 */