import java.util.*;
class SecondLargest
{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("ENter A=");
    int a =sc.nextInt();
    System.out.println("Enter B=");
    int b =sc.nextInt();
    System.out.println("Enter c =");
    int c=sc.nextInt();
//Finding if a is greater than b&c
    if (a>b&&a>c) {
//finding if b is grater than c is no c is printed
      if (b>c) {
        System.out.println(b+ " Is the Second greates");
      }
      else {
        System.out.println(c+ " Is the Second greates");
      }
    }
//Finding a is lesser than b & c
    if (a<c&&a<c) {
      if (b>a) {
        System.out.println(b+ " Is the Second greates");
      }
      else {
        System.out.println(a+ " Is the Second greates");
      }
    }
  }
}
