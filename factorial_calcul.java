 import java.util.Scanner;
  class factorial_calcu {
  public static void main(String [] agrs){
  Scanner sc =new Scanner(System.in);
  int a;
  int fact=1;
  System.out.println("enter any number");
  a=sc.nextInt();
  for(int i=1;i<=a;i++){
  fact=fact*i;
  System.out.println("factorial is "+fact);
    }
}
}
