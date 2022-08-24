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
//Finding if a is greater 2nd
if (a>b&&a<c||a>c&&a<b) {
  System.out.println(a);
}
  else if (b>a&&b<c||b>c&&b<a) {
    System.out.println(b);
  }
    else {
      System.out.println(c);
    }
  }
}
