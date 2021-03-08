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

  val seenMap: collection.mutable.Map[Int, Int] = mutable.HashMap()
  var lastDebug = System.nanoTime / 1000000

  def specialMath(n: Int): Int = {
    if (n == 0) return 0
    else if (n == 1) return 1
    val out = n + specialMath(n-1) + specialMath(n-2)
    if (debug && (System.nanoTime / 1000000 - lastDebug) > 10) {
      lastDebug = System.nanoTime / 1000000
      seenMap(out) = seenMap.getOrElse(out, 0) + 1
      val seenCount = seenMap(out)
      println(s"$out - $seenCount")
    }
    out
  }

  specialMath(in)
}
