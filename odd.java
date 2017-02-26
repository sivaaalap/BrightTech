import java.io.*;
import java.util.*;
class odd
{
public static void main(String args[])
{
int a,b,c;
Scanner in=new Scanner(System.in);
try
{
System.out.println("Enter the number");
a=in.nextInt();
a=a%2;
if(a!=0)
System.out.println("Odd:"+a);
else
System.out.println("Even:"+a);
}
catch (IOException e)
{
System.out.println("error");
}
}
}


