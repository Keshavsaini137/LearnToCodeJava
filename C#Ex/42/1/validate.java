import java.util.Scanner;

class logic{
  private int _number;
  public void setNumber(int num){
    _number = num;
  }

  public int getNumber(){
    return _number;
  }

  public String isValidLogic(){
    String validity;
    
    if(getNumber() <= 10 && getNumber() >= 1)
    validity = "Valid";
    else
    validity = "Invalid";

    return validity;
  }
}

class validate{
  public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    logic logicObj = new logic();

    System.out.print("Enter a number form 1 to 10 : ");
    logicObj.setNumber(s.nextInt());
    System.out.println(logicObj.isValidLogic());

  }
}
