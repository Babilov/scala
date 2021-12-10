import scala.util.Random
import scala.math.BigInt
import scala.math.BigInt.probablePrime

object HelloWorld {
  def task2(): String = {
    return "crazy" * 3
  }

  def task3(): Int = {
    return 10 max 2
  }

  def task4(): BigInt = {
    val result = BigInt(2).pow(1024)
    return result
  }

  def task5(): BigInt = {
    val result = probablePrime(100, new Random())
    return result
  }

  def task6(): String = {
    val result =  BigInt.probablePrime(100, new Random()).toString(36)
    return result
  }

  def task7(): String = {
    val string = "hello"
    return "Исходное слово: " + string + "\t Первая буква: " + string.take(1) + "\t Последняя буква: " + string.takeRight(1)
  }

  def task9(n: Int): Int = {
    if (n > 0){
      return 1
    }
    else{
      if (n == 0){
        return 0
      }
      else{
        return -1
      }
    }

  }

  def task11(): Unit = {
    for (i <- 0 to 10 reverse){
      print(i + " ")
    }
    println()
  }

  def task12(n: Int): Unit = {
    for (i <- 0 to n){
      print(i + " ")
    }
    println()
  }

  def task13(word: String): Long = {
    var result: Long = 1
    for (char <- word){
      result *= char.toLong
    }
    return result
  }

  def task14(word: String): Long = {
    var result: Long = "Hello".map(_.toLong).product
    return result
  }

  def task16(word: String): Long = {
    if(word.length == 1){
      return word.charAt(0).toLong
    }
    else {
      word.take(1).charAt(0).toLong * task16(word.drop(1))
    }

  }

  def task17(x: Int, n: Int): Int = {
    if (n == 0) 1
    else if (n > 0 && n % 2 == 0) x * task17(x, n / 2)
    else if (n > 0 && n % 2 != 0) x * task17(x, n - 1)
    else  1 / x - n
  }


  def main(args: Array[String]): Unit  = {
    println("task2: " + task2())
    println("task3: 10 max 2 = " + task3() + " - вывод максимума между 10 и 2")
    println("task4: 2 ^ 1024 = " + task4())
    println("task5: " + task5() + " - import scala.math.BigInt.probablePrime \t and \t import scala.util.Random")
    println("task6: " + task6())
    println("task7: " + task7() + " - take(1), takeRight(1)")
    println("task8: take(n) - возвращает первые n символов \t takeRight(n) - возвращает последние n символов \n" +
      "\t   drop(n) - возвращает строку без первых n символов \t dropRight(n) - возвращает строку без последних n символов \n" +
      "\t   substring(start, end) - возвращает строку от start до end" )
    println("task9: n = 100 -> " + task9(100) + ", \tn = -15 -> " + task9(-15) + ",   \tn = 0 -> " + task9(0))
    println("task10: {}: возвращает - (), \t тип - Unit")
    print("task11: ")
    task11()
    print("task12: ")
    task12(15)
    println("task13: " + task13("Hello"))
    println("task14: " + task14("Hello"))
    println("task16: " + task16("Hello"))
    println("task17 " + task17(2, 3))
  }
}
