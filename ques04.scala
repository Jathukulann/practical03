

def aboveFive(sList : List[String]) : List[String]={
    sList.filter(_.length >5)
}
def main(args: Array[String]):Unit={
val stringList = List("hello","programme","colombo uni","ucsc")
val abovefiveList=aboveFive(stringList)

println(abovefiveList)
}