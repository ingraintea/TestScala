/**
 * Created by pskrebnev on 18.02.2015.
 */

object ExPage159ClassEx extends App {

  // Task 1
  class Dimention(var height: Int, var width: Int)

  val theBox1 = new Dimention(5,7)
//  println("height = " + theBox1.height + " and width = " + theBox1.width)

  theBox1.height = 10
//  println("height = " + theBox1.height + " and width = " + theBox1.width)

  theBox1.width = 19
//  println("height = " + theBox1.height + " and width = " + theBox1.width)

  // Task 2
  class Info(val name: String, var description: String)

  val info1 = new Info("stuff", "Somebody")
  println("The name = " + info1.name)
  println("The description = " + info1.description)
  info1.description = "Changed description"
  println("The another description = " + info1.description)

  // Task 3
  // Just change _val name: String_ to _var name: String_

  // Task 5
  class SimpleTime(val sHours: Int, val sMinutes: Int = 0) {
    def substractTime(aTime: SimpleTime): SimpleTime = {
      val h = sHours - aTime.sHours
      val m = sMinutes - aTime.sMinutes
      if(h < 0) {
        new SimpleTime(0, 0)
      } else if(m >= 0) {
        new SimpleTime(h, m)
      } else {
        new SimpleTime(h - 1, m + 60)
      }
    }
  }












}





