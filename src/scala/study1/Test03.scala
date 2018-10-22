package study1

import scala.collection.mutable.ArrayBuffer

class Test03 {

  def main(args: Array[String]): Unit = {
    val numberArray = new Array[Int](10)
    val strArray = new Array[String](10)

    strArray(0)="0"

    val strArray2 = Array("one","second")

    val strArrayVar = ArrayBuffer[String]()

    strArrayVar+="one"

    strArrayVar+=("one","two")

    strArrayVar++=Array("one","two","xx")

    strArrayVar++=List("one","two","3")

    strArrayVar.trimEnd(3)

    var intArrayVar = ArrayBuffer(1,2,3)
    intArrayVar.insert(1,2)

    intArrayVar.insert(1,2,3,4)

    intArrayVar.toArray

    intArrayVar.remove(0,4)

    intArrayVar.toBuffer

    //数组的遍历
    for(i <- 0 to intArrayVar.length -1)print(i)
    for(i <- 0 until intArrayVar.length -1)print(i)
    for(i <-  intArrayVar)print(i)
    for(i <- 0 to (intArrayVar.length,2))print(i)
    for(i <- (0 to intArrayVar.length).reverse)print(i)

    //数组的转换
    var intArrayVar2 = for(i <- intArrayVar) yield i*2
    //定长数组转化后产生的仍然是定长数组 原数组不变
    var intArrayNoBuffer = Array(1,2,3)
    

  }
}
