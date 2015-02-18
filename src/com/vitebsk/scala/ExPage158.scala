/**
 * Created by pskrebnev on 17.02.2015.
 */

// page 158. Auxiliary Constructions
object ExPage158 extends App {

  // Task 1
  class ClothesWasher(val model: String,
                      val capacity: Double) {
    val cycles = 5
//    println("Default")

    def this(model: String) = {
      this(model, 2)
    }

    def this(capacity: Double) = {
      this("Unknown", capacity)
    }

    def this() = {
      this("Unknown", 2)
    }
  }
  
  var closeWasher1 = new ClothesWasher()
//  println(closeWasher1.capacity + " " + closeWasher1.model)

  // Task 2
  class ClothesWasher2(val model: String = "Uppsala",
                       val capacity: Double = 22.5) {
    val cycles = 5

    def this(model: String) = {
      this(model, 14.6)
      println("Constructor: only model")
    }

    def this(capacity: Double) = {
      this("Morgot", capacity)
      println("Constructor: only capacity")
    }

    def this() = {
      this("Keruna", 10.0)
      println("Constructor on-default")
    }
  }

  val closeWasher14 = new ClothesWasher2()
  val closeWasher15 = new ClothesWasher2(12)
  val closeWasher16 = new ClothesWasher2("Fingolfin")

  println("clW14 is = " + closeWasher14.model + " " + closeWasher14.capacity)
  println("clW15 is = " + closeWasher15.model + " " + closeWasher15.capacity)
  println("clW16 is = " + closeWasher16.model + " " + closeWasher16.capacity)

/* Output:
Constructor on-default
Constructor: only capacity
Constructor: only model
clW14 is = Keruna 10.0
clW15 is = Morgot 12.0
clW16 is = Fingolfin 14.6
*/

}



