import java.io.*;
import java.util.*;
class Num
{
public static void main(String args[]){
int a,b,c;
Scanner in=new Scanner(System.in);
System.out.println("Enter a Given Number");
a=in.nextInt();
if(a>0)
System.out.println("Positive");
else if(a<0)
System.out.println("Negative");
else if(a==0)
System.out.println("Zero");
else
System.out.println("Statement Wrong");
}
}

