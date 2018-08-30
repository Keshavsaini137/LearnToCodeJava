import java.util.Scanner;

// class num{
//   //find biggest number.
//
//
//
// }

class BiggestNum{
  public static void main(String args[]){

    Scanner s=new Scanner(System.in);

    int x,y,z;
    x = s.nextInt();
    y = s.nextInt();
    z = s.nextInt();

  if(x>y && x>z){
    System.out.println(x  + "X Is the biggest number");
  }
  if(y>z && y>x){
    System.out.println(y + "y Is the biggest number");
  }

  if(z>x && z>y){
    System.out.println(z + "z Is the biggest number");
  }


  }
}
