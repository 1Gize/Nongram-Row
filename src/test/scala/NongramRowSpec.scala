import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import NongramRow._
class NongramRowSpec extends AnyFlatSpec with should.Matchers {
//  def nongramRow(ar: Array[Int]): Array[Int]={
//    ar match {
//      case Array() =>  Array.empty
//      case Array(0,0,0,0,0) =>  Array.empty
//      case Array(1,1,1,1,1) =>  Array(5)
//      case Array(0,1,1,1,1,1,0,1,1,1,1) => Array(5,4)
//      case Array(1,1,0,1,0,0,1,1,1,0,0) => Array(2,1,3)
//      case Array(0,0,0,0,1,1,0,0,1,0,1,1,1) => Array(2,1,3)
//      case Array(1,0,1,0,1,0,1,0,1,0,1,0,1,0,1) => Array(1,1,1,1,1,1,1,1)
//    }
//  }
  it should "return Array(0) for empty array input" in{
   nongramRow(Array.empty) shouldBe Array.empty
  }
  it should "return Array(0) for Array(0,0,0,0,0)" in{
    nongramRow(Array(0,0,0,0,0)) shouldBe Array.empty
  }
  it should "return Array(5) for Array(1,1,1,1,1) input" in{
    nongramRow(Array(1,1,1,1,1)) shouldBe Array(5)
  }
  it should "return Array(5,4) for Array(0,1,1,1,1,1,0,1,1,1,1) input" in{
    nongramRow(Array(0,1,1,1,1,1,0,1,1,1,1)) shouldBe Array(5,4)
  }
  it should "return Array(2,1,3) for Array(1,1,0,1,0,0,1,1,1,0,0) input" in{
    nongramRow(Array(1,1,0,1,0,0,1,1,1,0,0)) shouldBe Array(2,1,3)
  }
}
