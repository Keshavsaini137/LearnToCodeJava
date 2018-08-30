import java.util.Scanner;

class MaxNum{
  public static void main(String []args){
    Scanner s = new Scanner(System.in);
    FindMaximum MaxObj = new FindMaximum();

    System.out.print("Enter first number: ");
    int firstNum = s.nextInt();
    System.out.print("Enter Second number: ");
    int secondNum = s.nextInt();

    MaxObj.setNum(firstNum,secondNum);
    System.out.println(MaxObj.isMaximum());

  }
}
