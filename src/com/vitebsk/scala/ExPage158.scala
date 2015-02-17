/**
 * Created by pskrebnev on 17.02.2015.
 */

// page 158. Auxiliary Constructions
object ExPage158 extends App {
  class ClothesWasher(val model:String,
                      val capacity:Double) {
    val cycles = 5
//    println("Default")

    def this(model:String) = {
      this(model, 2)
    }

    def this(capacity:Double) = {
      this("Unknown", capacity)
    }

    def this() = {
      this("Unknown", 2)
    }
  }
  
  var closeWasher1 = new ClothesWasher()
  println(closeWasher1.capacity + " " + closeWasher1.model)
}



