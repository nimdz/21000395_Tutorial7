object Q2 extends App{
     def calculateSquare(inputList:List[Int]):List[Int]={
         inputList.map(number => number*number)
     }

  val inptList=List(1,2,3,4,5)
  val output=calculateSquare(inptList)
  println(output)


}
