/**
 * Created by pskrebnev on 17.02.2015.
 */

// p.156
object AuxiliaryConstructions extends App {

  class GardenGnome(val height: Double,
                    val weight: Double,
                    val happy: Boolean,
                    val mess: String) {
    println("Inside primary constructor")
    var painted = true

    def magic(level: Int): String = {
      println("Call for -magic- function!")
      "Poof! " + level
    }

    def this(height: Double) {
      this(height, 100.0, true, "Call for height")
    }

    def this(name: String) = {
      this(15.0)
      painted
      name
    }

    def show(): String = {
      height + " show function " + weight + " " + happy + painted + mess
    }
  }

  new GardenGnome(20.0, 15.0, false, "Havanna").show()
  new GardenGnome(height = 21.0).show()
}