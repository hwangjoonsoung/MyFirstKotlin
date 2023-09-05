package day5

open class Generic {
    open fun shout() {
        println("소리친다")
    }
}

class B : Generic() {
    override fun shout() {
        println("B가 소리친다")
    }

    fun test (){

    }
}

class C : Generic() {
    override fun shout() {
        println("C 가 소리친다")
    }
}

class DosUsinGeneric<T : Generic>(val t: T) {
    fun doShout() {
        t.shout()
    }
}
class DosUsinGeneric2<E : Generic>(val t: E) {
    fun doShout() {
        t.shout()
    }
}

fun<T : Generic> doShout(a:T){
    a.shout()
}

fun main() {
//    var test = DosUsinGeneric(B())
//    test.doShout()
//    DosUsinGeneric(C()).doShout()

//    doShout(C())
    var te : Generic = B()
    te.shout()

}