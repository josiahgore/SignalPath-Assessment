import org.scalatest.FunSuite

class SpecialMathTest extends FunSuite {
  test("SpecialMath.specialMath") {
    assert(SpecialMath.specialMath(0) === 0)
    assert(SpecialMath.specialMath(1) === 1)
    assert(SpecialMath.specialMath(2) === 3)
    assert(SpecialMath.specialMath(3) === 3)
    assert(SpecialMath.specialMath(7) === 79)
    assert(SpecialMath.specialMath(17) === 10926)
  }
}
