package day1

fun main() {

    /*형변환 함수
    toString 과 같이 to+자료형으로 이뤄져 있음
    */
    var charA : Int = 1;
    print("charA is Int : ")
    println(charA is Int)

    var stringB = charA.toString()
    print("stringB is String : ")
    println(stringB is String)

    /*특이한 점*/
    // 명시적 형변환만 지원하고 암시적 형변환 지원하지 않음.
    var longA : Long = 10000L;
    //var IntB : Int = LongA; 이건 안된다. 따라서 toInt로 변환해 줘야 한다.
    var intB : Int = longA.toInt();
    print("intB is Int : ")
    println(intB is Int)

    println("=========================================================")
    /*=========================================================*/
    var intArr = arrayOf(1,2,3,4,5);
    var stringArr = arrayOfNulls<String>(5);
    println(stringArr[0])
    stringArr[0] = "10"
    println(stringArr[0])
    println(stringArr)
}