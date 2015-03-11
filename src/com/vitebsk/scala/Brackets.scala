/**
 * Created by pskrebnev on 10.03.2015.
 */

object Brackets extends App {

  val input0 = "(Ene() bene (raba), quinter) ((finter) frog)"
  val input1 = ""
  val input2 = "())"
  val input3 = "Sm mess(("
  val input4 = "m m(()))"

  /**
   *
   * @param list
   * @return -- Boolean
   */
  def brackets2(list: List[Char]): Boolean = {
    def checkSym(c: Char): Int = c match {
      case '(' => 1
      case ')' => -1
      case _ => 0
    }
    def cutSymbol(x: Int, list: List[Char]): Int = list match {
      case Nil => x
      case head :: tail =>
        cutSymbol(x + checkSym(head), tail)
    }
    cutSymbol(0, list) == 0
  }

  println(brackets2(input0.toList))
  println(brackets2(input1.toList))
  println(brackets2(input2.toList))
  println(brackets2(input3.toList))
  println(brackets2(input4.toList))


  //From Artsiom Miklushow
/*  def balance(chars: List[Char]): Boolean = {
    balanceTail(0, chars)
  }

  def balanceTail(acc: Int, chs: List[Char]): Boolean = {
    if (chs.isEmpty && acc == 0) true
    else if (acc >= 0 && !chs.isEmpty) {
      if ('(' == chs.head) balanceTail(acc + 1, chs.tail);
      else if (')' == chs.head) balanceTail(acc - 1, chs.tail);
      else balanceTail(acc, chs.tail);
    } else false
  }*/

}


