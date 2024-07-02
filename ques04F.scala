

def findsum(sList : List[Int]) : Int={
    sList.filter(_%2==0).sum
}
def main(args: Array[String]):Unit={
val intList = List(12,10,7,24)
val summ=findsum(intList)

println(summ)
}