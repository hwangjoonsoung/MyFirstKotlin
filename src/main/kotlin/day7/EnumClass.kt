package day7

/*
data class
1. 내용의 동일성 체크 equls()
2. hashcode()
3. tosting()
4. copy()
5. component()
 */
class General(val name : String , val id : Int) {
}
data class Data (val name : String , val id : Int)

enum class State(val message : String){
    SING("노래"),
    EAT("먹기"),
    SLEEP("잠");

    fun isSleeping() = this ==SLEEP
}

fun main() {
/*
    val a = General("boy", 10)
    println(a == General("boy", 10))
    println(a.hashCode())
    println(a)

    val b = Data("ruda", 11)
    println(b==Data("ruda", 11))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("arin"))
    println(b.copy(id = 123))

    println("test : " +(b.copy("arin") == Data("arin", 11)))

    val list = listOf(Data("arin", 100) , Data("boyoung", 200),Data("hwang", 300) )
    for((a,b) in list){
        println(a+ " : "+b)
    }*/

    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state)
    println(state.isSleeping())

    state = State.EAT
    println(state)

}