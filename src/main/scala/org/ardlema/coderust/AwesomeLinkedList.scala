package org.ardlema.coderust

import scala.collection.mutable

case class AwesomeLinkedList(linkedListToReverse: mutable.LinkedList[Int]) {

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

  def removeElementFromList(positionOfTheElementToBeRemoved: Int): mutable.LinkedList[Int]  = {
    loopAndRemoveElementFromLinkedList(linkedListToReverse, positionOfTheElementToBeRemoved, 0)
  }

  def loopAndRemoveElementFromLinkedList(linkedListToModify: mutable.LinkedList[Int], positionOfTheElementToBeRemoved: Int, count: Int): mutable.LinkedList[Int] = {
    val isTheElementToBeRemoved = positionOfTheElementToBeRemoved == count
    val firstElement = linkedListToModify.get(0)
    firstElement match {
      case None => new mutable.LinkedList[Int]
      case Some(x: Int) => if (isTheElementToBeRemoved) linkedListToModify.tail
                           else x +: loopAndRemoveElementFromLinkedList(linkedListToModify.tail, positionOfTheElementToBeRemoved, count+1)
    }
  }

  def removeDuplicatesFromList(): mutable.LinkedList[Int]  = {
    loopAndRemoveDuplicatedElementsFromLinkedList(linkedListToReverse)
  }

  def loopAndRemoveDuplicatedElementsFromLinkedList(linkedListToModify: mutable.LinkedList[Int]): mutable.LinkedList[Int] = {
    val firstElement = linkedListToModify.get(0)
    firstElement match {
      case None => new mutable.LinkedList[Int]
      case Some(x: Int) => x +: loopAndRemoveDuplicatedElementsFromLinkedList(removeElementFromList(linkedListToModify.tail, x))
    }
  }

  def removeElementFromList(linkedList: mutable.LinkedList[Int], elementToBeRemoved: Int) = {
    linkedList.filterNot(element => element == elementToBeRemoved)
  }
}
