class FizzBuzz{
  def isDivisibleBy(number: Int, divisor: Int): Boolean = number % divisor == 0
  def isDivisibleByThree(number: Int): Boolean = isDivisibleBy(number, 3)
  def isDivisibleByFive(number: Int): Boolean = isDivisibleBy(number, 5)
  def isDivisibleByThreeAndFive(number: Int): Boolean = isDivisibleBy(number, 3) && isDivisibleBy(number, 5)
}

object FizzBuzz {
  def play{
    var i = 1
    val fizzBuzz = new FizzBuzz
    while (i <= 100){
      var say = ""
      if(fizzBuzz.isDivisibleByThree(i)) say = "Fizz"
      if(fizzBuzz.isDivisibleByFive(i)) say = "Buzz"
      if(fizzBuzz.isDivisibleByThreeAndFive(i)) say = "FizzBuzz"
      if(say isEmpty) say = i.toString
      println(say)
      i += 1
    }
  }
}
