fun main(){
    var List = listOf("A","B","C","D","E")
    var Array = arrayOf("F","G","H","I")
    var MutableList = mutableListOf("J","K","L")
    println("--")
    for ((index,value) in Array.withIndex()){
        println(" in the index : "+"$index" + "the name is" + "$value")
    }
    println("--")
    for (item in List.iterator()){
        println("$item")
    }
    println("--")
    for (element in MutableList.indices){
        println(MutableList[element])
    }
}