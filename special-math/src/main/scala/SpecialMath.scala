import scala.collection.immutable.ListMap
import scala.collection.mutable

object SpecialMath extends App {
  val usage =
    """
      |Usage: SpecialMath <number> [--debug]
    """.stripMargin

  if (args.length == 0 || args.length > 2) {
    println(usage)
    sys.exit(1)
  }
  val in = args(0).toInt
  var debug = false
  if (args.contains("--debug")) {
    debug = true
  }

  val nanoToSecs = 1000000000
  val seenMap: collection.mutable.Map[Int, Int] = mutable.HashMap()
  var lastDebug = System.nanoTime / nanoToSecs

  def specialMath(n: Int): Int = {
    if (n == 0) return 0
    else if (n == 1) return 1
    val out = n + specialMath(n-1) + specialMath(n-2)

    if (debug && (System.nanoTime / nanoToSecs - lastDebug) > 60) {
      lastDebug = System.nanoTime / nanoToSecs
      seenMap(out) = seenMap.getOrElse(out, 0) + 1
      val sorted = ListMap(seenMap.toSeq.sortWith(_._2 > _._2):_*)
      println()
      for ((k,v) <- sorted) println(s"$k -> $v")
    }

    out
  }

  println(specialMath(in))
}
