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
//  println(s"This is doubled numbers ${explicitDouble(2,1,4)(0)}")

  // Task 2
  def explicitList(vec: Vector[Double]): List[Double] = {
    val list = vec.toList
    list
  }
//  println(s"Transformation from Vector to List ${explicitList(Vector(15, -10, 8, 22, 0.5))}")

  // Task 3
  def explicitSet(vec: Vector[Double]): Set[Double] = {
    val set = vec.toSet
    set
  }
  println(s"Transformation from Vector to Set ${explicitSet(Vector(1, -1, 1, 2, 2, 0, 3, 4, 4))}")




}



