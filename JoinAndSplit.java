import java.util.Scanner;

class Join{
  private String _string1;
  private String _string2;

  public void setString1(String string1){
    _string1 = string1;
  }

  public void setString2(String string2){
    _string2 = string2;
  }

  public String getString1(){
    return _string1;
  }

  public String getString2(){
    return _string2;
  }
}

class Split extends Join{

  public String[] SplitString(){
    String[] strings = getString1().split(" ",2);

    return strings;
  }
}

class JoinAndSplit{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    Split objSplit = new Split();

    System.out.println("Enter the String you wants to split");
    objSplit.setString1(s.nextLine());

    for(String tempStrings : objSplit.SplitString()){
      System.out.println(tempStrings);
    }
  }
}
