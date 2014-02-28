package org.ardlema.coderust

import org.scalatest._
import scala.collection.mutable

class AwesomeLinkedListTests
  extends FunSpec
  with Matchers {
  describe("The AwesomeLinkedList class") {
    it("should be able to reverse a linked list"){
      val linkedListToBeReversed = mutable.LinkedList(1,2,3,4,5)

      val reversedLinkedList = AwesomeLinkedList(linkedListToBeReversed).reverseLinkedList()

      reversedLinkedList.get(0) should equal (Some(5))
      reversedLinkedList.get(1) should equal (Some(4))
      reversedLinkedList.get(2) should equal (Some(3))
      reversedLinkedList.get(3) should equal (Some(2))
      reversedLinkedList.get(4) should equal (Some(1))
      reversedLinkedList.get(5) should equal (None)
    }

    it("should be able to get rid of one element of the list"){
      val linkedListToBeModified = mutable.LinkedList(1,2,3,4,5)

      val linkedListWithoutElement = AwesomeLinkedList(linkedListToBeModified).removeElementFromList(2)

      linkedListWithoutElement.size should equal(4)
      linkedListWithoutElement.get(0) should equal (Some(1))
      linkedListWithoutElement.get(1) should equal (Some(2))
      linkedListWithoutElement.get(2) should equal (Some(4))
      linkedListWithoutElement.get(3) should equal (Some(5))
      linkedListWithoutElement.get(4) should equal (None)
    }

    it("should be able to remove duplicate elements"){
      val linkedListToBeModified = mutable.LinkedList(1,2,3,4,2,1,5,4,6,7,8,4,7)

      val linkedListWithoutDuplicateElements = AwesomeLinkedList(linkedListToBeModified).removeDuplicatesFromList()

      linkedListWithoutDuplicateElements.size should equal(8)
      linkedListWithoutDuplicateElements.get(0) should equal (Some(1))
      linkedListWithoutDuplicateElements.get(1) should equal (Some(2))
      linkedListWithoutDuplicateElements.get(2) should equal (Some(3))
      linkedListWithoutDuplicateElements.get(3) should equal (Some(4))
      linkedListWithoutDuplicateElements.get(4) should equal (Some(5))
      linkedListWithoutDuplicateElements.get(5) should equal (Some(6))
      linkedListWithoutDuplicateElements.get(6) should equal (Some(7))
      linkedListWithoutDuplicateElements.get(7) should equal (Some(8))
      linkedListWithoutDuplicateElements.get(8) should equal (None)
    }
  }
}

