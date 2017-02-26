import java.io.*;
import java.util.Scanner;

class siva{
public static void main(String args[])
{
int a,b,c;
System.out.println("Enter the three values:");
Scanner in=new Scanner(System.in);

a=in.nextInt();
b=in.nextInt();
c=in.nextInt();

if (a>b &&  a>c)
System.out.println("A is Large"+a);
else if(b>c)
System.out.println("B is larger"+b);
else 
System.out.println("C is large"+c);
}
}

