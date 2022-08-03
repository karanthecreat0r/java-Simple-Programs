import java.util.*;
class smallestTwo
{
  static Scanner sc=new Scanner (System.in);
  public static void main(String[] args) {
    System.out.println("Enter the number a =");
    int num1 =sc.nextInt();
    System.out.println("Enter the number b =");
    int num2 = sc.nextInt();
    int largest = (num1<num2)?num1:num2;
    System.out.println("The Largest of two number is = "+largest);

  }
}
