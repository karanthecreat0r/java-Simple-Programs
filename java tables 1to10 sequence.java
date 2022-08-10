//Tabels printing sub diffrent form


import java.util.*;
class Tables
{
  static Scanner sc=new Scanner(System.in);//Scanner Class
  public static void main(String[] args) throws Exception {
    System.out.println("\tWelcome to Tables Printing");//printing The Welcome message
    System.out.println("Enter the Starting number A for the table=");//Enter first int A
    //Reading The first input
    int A =sc.nextInt();
    System.out.println("Enter the ending number B for the table=");//second int B
    //Reading B
    int B =sc.nextInt();
    System.out.println("\tThe Tabels are "+(char)+1);
    for (int I=A;I<=B;I++ ) {//outer for loop which has input to Excecution
      //Inner for loop (or)Nested loop
      for (int J=1;J<=10 ;J++ ) {//our material of tabel concept implemented
        System.out.println(I+" * "+J+" = "+I*J);//this loop reapets for 10 times
        Thread.sleep(450);//slepping time for tabels
      }
      System.out.println("*******End of Table Sequence Succesfull"+(char)1+"*******");//final for first sequence
    }
  }
}
