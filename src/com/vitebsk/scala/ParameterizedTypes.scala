/**
 * Created by pskrebnev on 18.02.2015.
 */

object ParameterizedTypes extends App {

  // Examples from book
  class ExplicitObjects {
    def explcit(c1: String, c2: String, c3: String): Vector[String] = {
      Vector(c1, c2, c3)
    }
  }

  val ret = new ExplicitObjects
  val vo = ret.explcit("One", "Two", "Three")
//  println(s"This is the Vector ${vo(0)}")

  // Task 1
  def explicitDouble(v1: Double, v2: Double, v3: Double): Vector[Double] = {
    Vector(v1, v2, v3)
  }
  println(s"This is doubled numbers ${explicitDouble(2,1,4)(0)}")



}



