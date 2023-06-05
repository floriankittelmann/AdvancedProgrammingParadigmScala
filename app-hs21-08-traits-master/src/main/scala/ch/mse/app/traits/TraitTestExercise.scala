package ch.mse.app.traits

object TraitTestExercise {

  trait A {
    println(">>A")
    def print = { println("A")}
  }

  trait B{
    println(">>B")
    def print = { println("B")}
  }

  trait C extends A with B{
    println(">>C")
    override def print = { println("C") }
  }

  trait D extends B with A{
    println(">>D")
    override def print = { println("D") }
  }

  class E extends D with C{
    println(">>E")
    override def print = { println("E") }
  }

  def main(args: Array[String]): Unit = {
    val e = new E
    e.print
  }
}
