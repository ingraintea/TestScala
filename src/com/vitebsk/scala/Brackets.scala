/**
 * Created by pskrebnev on 10.03.2015.
 */

object Brackets extends App {

  /**
   * Exercise 2
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

  val input = "(Ene() bene (raba), quinter) ((finter) frog)"
  val input1 = ""
  val input2 = "((()))(("

  println(balance(input.toList))
  println(balance(input1.toList))
  println(balance(input2.toList))

}


