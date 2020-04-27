package funsets

import scala.annotation.tailrec


trait FunSets {

  def maxSubSeq1(seq: Array[Int]): Int = {
    @tailrec
    def loop(maxIndex: Int, maxLen: Int, tempIndex: Int, tempLen: Int, curr: Int): Int = {
      if (curr == seq.length) maxIndex
      else {
        if (seq(curr) > seq(curr - 1)) {
          if (tempLen + 1 > maxLen)
            loop(tempIndex, tempLen + 1, tempIndex, tempLen + 1, curr + 1)
          else
            loop(maxIndex, maxLen, tempIndex, tempLen + 1, curr + 1)
        } else
          loop(maxIndex, maxLen, curr, 1, curr + 1)
      }
    }
    loop(0, 1, 0, 1, 1)
  }

  def maxSubSeq2(seq: Array[Int]): Int = {
    def findSequenceLengthOf(index: Int): Int = {
      if (index + 1 == seq.length) 1
      else {
        if (seq(index + 1) > seq(index))
          1 + findSequenceLengthOf(index + 1)
        else 1
      }
    }
    def loop(maxLength: Int, maxIndex: Int, currIndex: Int): Int = {
      if (currIndex == seq.length) maxIndex
      else {
        val length = findSequenceLengthOf(currIndex)
        if (length > maxLength)
          loop(length, currIndex, currIndex + length)
        else
          loop(maxLength, maxIndex, currIndex + length)
      }
    }
    loop(1, 0, 0)
  }
}

object FunSets extends FunSets
