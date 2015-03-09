/**
 * Created by pskrebnev on 09.03.2015.
 */

object PascalTriangle extends App {

  /**
   * Exercise 1
   */
  /**
   *
   * @param c -- number of column
   * @param r -- number of row
   * @return -- Int within Pascal's triangle
   */
  def pascal(c: Int, r: Int): Int = {
    var xCell = 0 // Int within Pascal's triangle
    if (c > r) 0
    else {
      if (r == 0) 1
      else {
        if (c == 0) 1
        else {
          xCell + pascal(c, r - 1) + pascal(c - 1, r - 1)
        }
      }
    }
  }

  println(s"(0-0) Expected 1 but = ${pascal(0, 0)}")
  println(s"(0-1) Expected 1 but = ${pascal(0, 1)}")
  println(s"(1-1) Expected 1 but = ${pascal(1, 1)}")

  println(s"(0-2) Expected 1 but = ${pascal(0, 2)}")
  println(s"(1-2) Expected 2 but = ${pascal(1, 2)}")
  println(s"(2-2) Expected 1 but = ${pascal(2, 2)}")

  println(s"(0-3) Expected 1 but = ${pascal(0, 3)}")
  println(s"(1-3) Expected 3 but = ${pascal(1, 3)}")
  println(s"(2-3) Expected 3 but = ${pascal(2, 3)}")
  println(s"(3-3) Expected 1 but = ${pascal(3, 3)}")

  println(s"(0-4) Expected 1 but = ${pascal(0, 4)}")
  println(s"(1-4) Expected 4 but = ${pascal(1, 4)}")
  println(s"(2-4) Expected 6 but = ${pascal(2, 4)}")
  println(s"(3-4) Expected 4 but = ${pascal(3, 4)}")
  println(s"(4-4) Expected 1 but = ${pascal(4, 4)}")

  println(s"(9-15) Expected 5005 but = ${pascal(9, 15)}")
  println(s"(7-20) Expected 77520 but = ${pascal(7, 20)}")

  println("\nZero as default")
  println(s"(1-0) Expected 0 but = ${pascal(1, 0)}")
  println(s"(4-1) Expected 0 but = ${pascal(4, 1)}")

}

