//Individual tables print java programme

import java.util.*;
class For111
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    System.out.println("\t****Welcome To Tabels Mania****");
    System.out.println("Enter the tables to print");
    int num=sc.nextInt();
    System.out.println("\tThe Tables are");
    for (int a=1;a<=10 ;a++ ) {
      Thread.sleep(500);
      System.out.println(num+ "*"+a+"="+num*a);
    }
  }
}
