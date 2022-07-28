import java.util.*;
class secondLargestOfThree
{
  static Scanner sc=new Scanner (System.in);
  public static void main(String[] args) {
    System.out.println("Enter the number a =");
    int a =sc.nextInt();
    System.out.println("Enter the number b =");
    int b = sc.nextInt();
    System.out.println("Enter the number c =");
    int c = sc.nextInt();
    int largest = (a>b && a<c)?a:(b>a && b<c)?b:c;
    System.out.println("The Largest of two number is = "+largest);

  }
}
