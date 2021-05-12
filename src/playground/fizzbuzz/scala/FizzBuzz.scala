package playground.fizzbuzz.scala

object FizzBuzz extends App {

  def printFB(i: Int): Unit = {
    @scala.annotation.tailrec
    def printFBHelper(n: Int): Unit = {
      println(printElement(n))
      if (i > n) printFBHelper(n + 1)
    }

    def printElement(n: Int) = {
      n match {
        case n if n % 3 == 0 && n % 5 == 0 => "Fizzbuzz"
        case n if n % 3 == 0 => "Fizz"
        case n if n % 5 == 0 => "Buzz"
        case _ => n
      }
    }
    printFBHelper(0)
  }

  printFB(10)
}
