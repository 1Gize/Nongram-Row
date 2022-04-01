import scala.collection.mutable

object NongramRow {
  def nongramRow(ar: Array[Int]) ={
    splitArray(ar,0).map(_.size).toArray
  }
  def splitArray[T](xs: Array[T], sep: T): List[Array[T]] = {
    var (res, i) = (List[Array[T]](), 0)

    while (i < xs.length) {
      var j = xs.indexOf(sep, i)
      if (j == -1) j = xs.length
      if (j != i) res ::= xs.slice(i, j)
      i = j + 1
    }

    res.reverse
  }
}
