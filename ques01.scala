def reverseString(s : String): String ={
    if(s.isEmpty)""
    else reverseString(s.tail)+s.head
}
def main(args: Array[String]):Unit={
    val string="scala programming"
    println("string is " +string)
    println("the reversed string is "+ reverseString(string))
}