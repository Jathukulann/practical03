def average(num1: Int, num2: Int): Double = {  
  val mean = (num1.toDouble + num2.toDouble) / 2  
  mean 
}

def main(args: Array[String]): Unit = {
  val num1 = 23
  val num2 = 34
  val meanIs = average(num1, num2)  
  println(f"$meanIs%.2f")  
}
