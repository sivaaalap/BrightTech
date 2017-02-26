import java.io.*;
import java.util.*;
class Leap{
public static void main(String args[])
{
int a;
System.out.println("Enter a Year:");
Scanner in=new Scanner(System.in);
a=in.nextInt();
if((a%100 ==0)||((a%4==0)&&(a%100 !=0)))
System.out.println("Leap Year");
else
System.out.println("Not Leap Year");
}
}
