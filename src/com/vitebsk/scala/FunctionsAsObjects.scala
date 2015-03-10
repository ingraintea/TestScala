/**
 * Created by pskrebnev on 20.02.2015.
 */

object FunctionsAsObjects extends App {

  val input = "(Massa) ((Iron) Maiden)"

  /**
   * Exercise 2
   */
  /**
   *
   * @param chars
   * @return -- Boolean
   */
  def balance(chars: List[Char]): Boolean = {
    if (chars.isEmpty) throw new NoSuchElementException("There is no" +
      " elements in the List your provided")
    else
      for (i <- chars) {
        println(i)
      }
    true
  }

//  def newChar(chars: List[Char]): List[Char] = {
//    chars = chars.tail
//  }

  println(balance(input.toList))
//  println(input.head)
//  println(input.tail)
//  println(input.isEmpty)
//  println(input.toList)




}







