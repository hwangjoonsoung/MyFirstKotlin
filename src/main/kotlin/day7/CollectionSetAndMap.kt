package day7

fun main() {
    val mutuableSet = mutableSetOf("apple", "banana", "cat")

    for (a in mutuableSet) {
        println(a)
    }
    mutuableSet.add("dog")
    println(mutuableSet)
    mutuableSet.remove("cat")
    println(mutuableSet)
    println()
    println(mutuableSet.contains("apple"))

    println("===============MAP=================")
    val mutableMap = mutableMapOf("a" to "apple" , "b" to " banana" , "c" to "cat" , 1 to "one")
    for (m in mutableMap){
        println(""+m.key+" "+ m.value)
    }
    mutableMap.put("d" , "dog")
    println(mutableMap)
    mutableMap.remove(1)
    println(mutableMap)
    println(mutableMap.size)
}