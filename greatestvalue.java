import java.util.Scanner;
public class greatestvalue{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("enter the 1st num");
int a=scan.nextInt();
System.out.println("enter the 2nd num");
int b=scan.nextInt();
System.out.println("enter the 3rd num");
int c=scan.nextInt();
if(a>b&&a>c)
System.out.println("greater num is:"+a);
else if(b>a&&b>c)
System.out.println("greater num is:"+b);
else
System.out.println("greater num is:"+c);
}
}