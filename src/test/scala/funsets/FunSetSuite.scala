package funsets

import org.junit._

/**
 * This class is a test suite for the methods in object FunSets.
 */
class FunSetSuite {

  import FunSets._

  trait TestSets {
    val s1: Array[Int] = Array(4, 5, 6, 7, 1, 1, 4, 6, 9, -5)
    val s2 = Array(0, 1, 2, 3, -4, 1, 2, 3, 4, 5, 6, 7, 7, 3, -4)
    val s3 = Array(0, 5, 1, 2, 3, 2, 1, 0, 5, 6, 7, 8, 1, 2, 3, 4)
    val s4 = Array(1, 2, 1, 2, 1, 2, 1, 2, 1, 2)
    val s5 = Array(1, 1, 1, 1, 1, 1, 1, 1, 1)
    val s6 = Array(1)
  }


  @Test def `maxSubSeq1 test (only tail recursion)`: Unit = {
    new TestSets {
      Assert.assertEquals(0, maxSubSeq1(s1))
      Assert.assertEquals(4, maxSubSeq1(s2))
      Assert.assertEquals(7, maxSubSeq1(s3))
      Assert.assertEquals(0, maxSubSeq1(s4))
      Assert.assertEquals(0, maxSubSeq1(s5))
      Assert.assertEquals(0, maxSubSeq1(s6))
    }
  }

  @Test def `maxSubSeq2 test`: Unit = {
    new TestSets {
      Assert.assertEquals(0, maxSubSeq2(s1))
      Assert.assertEquals(4, maxSubSeq2(s2))
      Assert.assertEquals(7, maxSubSeq2(s3))
      Assert.assertEquals(0, maxSubSeq2(s4))
      Assert.assertEquals(0, maxSubSeq2(s5))
      Assert.assertEquals(0, maxSubSeq2(s6))
    }
  }




  @Rule def individualTestTimeout = new org.junit.rules.Timeout(10 * 1000)
}
