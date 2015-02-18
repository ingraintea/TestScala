/**
 * Created by pskrebnev on 18.02.2015.
 */

object CaseClasses extends App {

  case class Dog(name: String)
  val dog1 = Dog("Henry")
  val dog2 = Dog("Ralf")
  val dog3 = Dog("Hav-Hav")
  val dogs = Vector(dog1, dog2, dog3)
//  println("The first dog is " + dogs(0).name)

  case class Cat(name: String, age: Int)
  val cats = Vector(Cat("Mimi", 2), Cat("Martin", 3), Cat("Mur-Murin", 10))
//  println("The third cat-age is " + cats(2).age)

//    Task 1
  case class Person(firstName: String, lastName: String, email: String)
  val p1 = Person("Vasia", "Nominarov", "as@wawa.com")
//  println("Name = " + p1.firstName + ". Surname = " + p1.lastName + ". Email = " + p1.email)

  // Task 2
  val peoples = Vector(Person("Vova", "Noma", "as@serka.com"), Person("Peop1", "Sigurn", "siga@asgirsen.com"))
  println(peoples(1))

  // Task 4
  case class Dimention(var height: Int, var width: Int)
  val dim = new Dimention(5, 7)
  println("Height = " + dim.height)















}




