import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int first_dig=n/100;
    int sec_dig=((n/10)%10);
    int last_dig=n%10;
    int rev=(last_dig*100+sec_dig*10+first_dig);
    System.out.println(rev);
  }
}