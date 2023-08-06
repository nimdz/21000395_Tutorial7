object Q1 extends App {

  def filterEvenNumbers(inputList:List[Int]):List[Int]={
       inputList.filter(number => number%2==0)

  }

  val inputList=List(1,2,3,4,5,6,7,8,9,10)
  val evenNumberList=filterEvenNumbers(inputList);
  println(evenNumberList);

}
