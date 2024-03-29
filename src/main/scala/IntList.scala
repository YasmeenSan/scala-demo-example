sealed trait IntList {

  def length: Int = this match {
    case End => 0
    case Pair(hd, tl) => 1 + tl.length
  }
}

  case object End extends IntList

  final case class Pair(head: Int, tail: IntList) extends IntList





