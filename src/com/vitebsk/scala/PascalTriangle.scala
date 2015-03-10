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
  def pascalOld(c: Int, r: Int): Long = {
    val xCell = 0 // Int within Pascal's triangle
    if (c > r) 0
    else {
      if (r == 0) 1
      else {
        if (c == 0) 1
        else {
          xCell + pascalOld(c, r - 1) + pascalOld(c - 1, r - 1)
        }
      }
    }
  }

  // more elegant solution
  def pascal(c: Int, r: Int): Long = {
    if (c > r) 0
    else {
      if (c == 0 || c == r) 1
      else {
        pascal(c, r - 1) + pascal(c - 1, r - 1)
      }
    }
  }

  //  println(s"(15-30) Expected 155 117 520 but = ${pascal(15, 30)}")
  //  println(s"(10-40) Expected 847 660 528 but = ${pascal(10, 40)}")
  //  println(s"(11-40) Expected 2 311 801 440 but = ${pascal(11, 40)}") // 0:20 to execute
  //  println(s"(12-40) Expected 5 586 853 480 but = ${pascal(12, 40)}") // 0:52 to execute
  //  println(s"(13-40) Expected 12 033 222 880 but = ${pascal(13, 40)}") // 2:03 to execute
  //  println(s"(14-40) Expected 23 206 929 840 but = ${pascal(14, 40)}") // 4:23 to execute
  //  println(s"(15-40) Expected 40 225 345 056 but = ${pascal(15, 40)}") // 6:13 to execute

  //  println("\nZero as default")
  //  println(s"(1-0) Expected 0 but = ${pascal(1, 0)}")
  //  println(s"(4-1) Expected 0 but = ${pascal(4, 1)}")

  println("\nZero as default")
  println(s"(1-0) Expected 0 but = ${pascal(1, 0)}")
  println(s"(4-1) Expected 0 but = ${pascal(4, 1)}")
  println(s"(15-30) Expected 155 117 520 but = ${pascal(15, 30)}")
  println(s"(10-40) Expected 847 660 528 but = ${pascal(10, 40)}")

}

