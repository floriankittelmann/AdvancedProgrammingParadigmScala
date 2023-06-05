package ch.mse.app.traits

import java.io.PrintStream
import java.time.LocalDate

object SummonTest {

  def main(args: Array[String]): Unit = {
    def logPrefixed(msg: String)(using out: PrintStream, prefix: String, num: Int): Unit = {
      out.println(s"[$prefix] " + msg + " - " + num);
    }
    given out: PrintStream  = System.out
    given datePrefix: String = "testPrefix"
    given testInt: Int = 1

    def otherLog()(using testString: String): Unit = {
      println(testString)
    }
    logPrefixed("test")(using summon, s"${LocalDate.now()}", 3)
    otherLog()
  }
}
