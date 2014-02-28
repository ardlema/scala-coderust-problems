package org.ardlema.coderust

import scala.collection.mutable

case class ReverseASingleLinkedList(linkedListToReverse: mutable.LinkedList[Int]) {

  def reverseLinkedList() = {
    loopAndReverseLinkedList(linkedListToReverse)
  }

  def loopAndReverseLinkedList(linkedListToReverse: mutable.LinkedList[Int]): mutable.LinkedList[Int] = {
    val firstElement = linkedListToReverse.get(0)
    firstElement match {
      case None => new mutable.LinkedList[Int]
      case Some(x: Int) => loopAndReverseLinkedList(linkedListToReverse.tail) :+  x
    }
  }
}
