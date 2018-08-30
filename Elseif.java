import java.util.Scanner;

class Elseif{
  public static void main(String args[]){
    //Find Area of Circle, Rectangle, Cube, Square.
    Scanner s = new Scanner(System.in);
    int n;
    n = s.nextInt();

    if(n==1){
      //Area of Circle is Pie*r*r.
      float area, pie = 3.14f;
      int r = 10;

      area = pie*r*r;
      System.out.println("area of circle " + area);
    }

    else if(n==2){
      //Area of Rectangle is Length*Breadth
      int l,b,area;
      l = 20;
      b = 20;

      area = l*b;
      System.out.println("Area of Rectangle " + area);

    }

    else if(n==3){
      //Area of Square is Side*side
      int area, side =30;
      area = side*side;

      System.out.println("Area of Square " + area);

    }

    else if(n==4){
      //Area of Cube is 6*Side*side. Or 6a^2
      int a = 10;
      int area = 6*a*a;

      System.out.println("Area of Cube " + area);

    }

  }
}
