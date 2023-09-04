package day4

fun main() {
    println(Counter.count)

    Counter.countUp()
    Counter.countUp()
    Counter.countUp()
    Counter.countUp()
    println(Counter.count)
    Counter.clear()
    println(Counter.count)

    println("=====================================================")
    var a = FoodPoll("짜장");
    var b = FoodPoll("짬뽕");
    a.vote();
    a.vote();
    a.vote();
    a.vote();
    b.vote()
    b.vote()
    b.vote()

    println(a.count)
    println(FoodPoll.total)

    println(b.count)
    println(FoodPoll.total)


}

object Counter {
    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
}

class FoodPoll (val name : String ){
    companion object{
        var total = 0;
    }
    var count = 0
    fun vote(){
        total++
        count++
    }

}