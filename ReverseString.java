import java.util.Scanner;
import java.util.*;

class reverse{
  private String _name;

  public void setName(String name){
    _name = name;
  }
  public String getName(){
    return _name;
  }

  public void Reverse(){
    String newName = getName();

    char[] newArray = new char[newName.length()];

    int j=0;
    for(int i = newName.length()-1; i>=0; i--){
      newArray[j] = newName.charAt(i);
      j++;
    }

    String reverseString = new String(newArray);
    System.out.println(reverseString);

  }

}

class ReverseString{
  public static void main(String[] args){

    Scanner s = new Scanner(System.in);
    reverse rev = new reverse();
    System.out.println("Enter the String you wants to reverse:");
    rev.setName(s.nextLine());
    rev.Reverse();

  }
}
