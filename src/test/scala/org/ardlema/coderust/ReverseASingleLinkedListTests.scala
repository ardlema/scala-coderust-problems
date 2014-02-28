package org.ardlema.coderust

import org.scalatest._
import scala.collection.mutable

class ReverseASingleLinkedListTests
  extends FunSpec
  with Matchers {
  describe("The org.ardlema.coderust.ReverseASingleLinkedList class") {
    it("should give me a pointer to the last element of the list"){
      val linkedList: mutable.LinkedList[Int] = mutable.LinkedList(1,2,3,4,5)

      val reversedLinkedList = ReverseASingleLinkedList(linkedList).reverseLinkedList()

      reversedLinkedList.get(0) should equal (Some(5))
      reversedLinkedList.get(1) should equal (Some(4))
      reversedLinkedList.get(2) should equal (Some(3))
      reversedLinkedList.get(3) should equal (Some(2))
      reversedLinkedList.get(4) should equal (Some(1))
      reversedLinkedList.get(5) should equal (None)
    }
  }
}

