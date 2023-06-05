package ch.mse.app.types.variance

abstract class Cage [A, B](a: A) { // - contravariant position
  def get: A				         // +  covariant position
  def put(animal: A): Unit 	 // -  contravariant position
  val animal: A			      	 // +  covariant position
  var animal2: A			       // +- covariant & contravariant position
  def exchange(animal: A): A // +- covariant & contravariant position
}

abstract class Cage2[-A, +B] {


  def strangeFunction(g: Cage2[B, A]): Cage2[A, B]
  // parameter g is a contravariant position -> the used placedholder in Cage2 reverts
  // return type is covariant position -> the used placeholder in Cage2 stays the same
}










abstract class Cage3[-A, +B] {


  def strangeFunction(g: Cage2[B, A]): Cage2[A, B]
  // parameter g is a contravariant position -> the used placedholder in Cage2 reverts
  // return type is covariant position -> the used placeholder in Cage2 stays the same
}

