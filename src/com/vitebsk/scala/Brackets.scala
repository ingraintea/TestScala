/**
 * Created by pskrebnev on 10.03.2015.
 */

object Brackets extends App {

  /**
   * Exercise 2. ver 1.0
   */
  /**
   *
   * @param chars
   * @return -- Boolean
   */
  def balance(chars: List[Char]): Boolean = {
    var x = 0
    if (chars.isEmpty) {
      true
    }
    else {
      def brackets(c: Char): Int = c match {
        case '(' => 1
        case ')' => -1
        case _ => 0
      }

      for (i <- chars) {
        x += brackets(i)
      }
      x == 0
    }
  }

  val input0 = "(Ene() bene (raba), quinter) ((finter) frog)"
  val input1 = ""
  val input2 = "((()))"
  val input3 = "Sm mess(("


  /*    тебе надо использовать аккумулятор.
      как только ты встретил ( - прибавляешь 1
      как только ) - отнимаешь 1
      и на каждом шаге у тебя должно выполняться условие, что acc >= 0 - в противном случае выходим с false,
      а есл дошли до конца листа и acc == 0 - то все*/

  /**
   * Exercise 2. ver. 1.1
   * @return -- Boolean
   */
  var x: Int = 0

  def brackets1(list: List[Char]): Boolean = {
    def checkSym(c: Char): Int = c match {
      case '(' => 1
      case ')' => -1
      case _ => 0
    }
    def cutSymbol(l: List[Char]): Int = l match {
      case head :: tail =>
        x += checkSym(head)
        cutSymbol(tail)
      case Nil => x
    }
    cutSymbol(list) == 0
  }


  println(brackets1(input0.toList))
  println(brackets1(input1.toList))
  println(brackets1(input2.toList))
  println(brackets1(input3.toList))


}


