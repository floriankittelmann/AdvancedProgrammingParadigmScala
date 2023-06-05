package ch.mse.app.traits

object TraitTest3 {

  trait LoggerParent {
    println(">>LoggerParent")
  }

  trait Logger extends LoggerParent {
    println(">>Logger")
  }

  trait SecondLogger {
    println(">>SecondLogger")
  }

  class TestLogger {
    println(">>TestLogger")
  }

  class Account extends TestLogger {
    println(">>Account")
  }

  def main(args: Array[String]): Unit = {
    println("myTest")
    val a = new Account with Logger with SecondLogger
  }
}
