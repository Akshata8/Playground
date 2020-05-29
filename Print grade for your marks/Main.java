import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
      int grade=in.nextInt();
      if(grade>=85)
        System.out.println("A");
      else if(grade>=75)
        System.out.println("B");
      else if(grade>=65)
        System.out.println("C");
      else if(grade>=55)
        System.out.println("D");
      else if(grade>=45)
        System.out.println("E");
      else
        System.out.println("Fail");
    }
}