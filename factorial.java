import java.util.Scanner;
class factorial {
  public static void main(String[] args){
    Scanner m = new Scanner(System.in);
    System.out.println("Enter number: ");
    int num = m.nextInt();
    // int num = 5;
    int a = 1;
    for (int i = 1; i<=num; i++) {
      a *= i;
    }
    System.out.println("factorial of " + num +" is "+a);
  }
}
      



