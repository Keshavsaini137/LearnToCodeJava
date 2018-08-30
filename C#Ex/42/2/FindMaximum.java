public class FindMaximum{
  private int _FirstNumber;
  private int _SecondNumber;

  public void setNum(int firstNum, int secondNum){
    _FirstNumber = firstNum;
    _SecondNumber = secondNum;
  }

  public int getFirstNum(){
    return _FirstNumber;
  }

  public int getSecondNum(){
    return _SecondNumber;
  }

  public String isMaximum(){
    String isMax;
    String firstNum = Integer.toString(getFirstNum());
    String secondNum = Integer.toString(getSecondNum());

    if(getFirstNum() == getSecondNum())
    isMax = firstNum + " and " + secondNum + " Both Are Equal";

    else if(getFirstNum() < getSecondNum()){
      isMax = "Maximum number is " + secondNum;
    }
    else{
      isMax = "Maximum number is " + firstNum;;
    }

    return isMax;
  }
}
