package day2

fun main() {
    var i :Int = 0;
    var j :Int = 0;
    for(i in 1..10){
        if(i ==5){
//            break
            continue
        }else{
            println(i)
        }
    }
    /*
    *
    * */
    loop1@for(i in 0..10 ){
        loop2@for(j in 0..10){
            if(i == 1 &&  j ==3){
                break@loop2
            }else{
//                println(""+  i +" : "+j )
                println("i : $i j : $j " ) // => ""안에서 $[변수]를 사용하면 ""안에서 해당 변순를 출력할 수 있다.
            }
        }
    }


}