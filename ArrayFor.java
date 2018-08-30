import java.util.Scanner;

class ArrayFor{
  public static void main(String args []){

Scanner s = new Scanner(System.in);
    int table[] = new int[10];

System.out.println("Enetr the Table number");
    int num = s.nextInt();
    int j=0;

for(int i=1;i<11;i++){
  int tb = num * i;
  System.out.println(num + " * " + i + " = " + tb);


    table[j] = tb;
  j++;
}

for(int k=0;k<table.length;k++){
  System.out.println("" + table[k]);
}

  }
}
