import kotlin.reflect.typeOf

fun main() {
    var str : String = "11"
    var strToInt : Int = str.toInt();
    println(strToInt)
    println(strToInt is Int)
//    println(strToInt is String) : 이게 안되나? is 가 불린값으로 나오게 만드는거 아니였네!?
}