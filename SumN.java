import java.io.*;
import java.util.*;
class SumN{
public static void main(String args[]){
int sum=0;
int n,i;
Scanner in=new Scanner(System.in);
System.out.println("Enter the N Size:");
n=in.nextInt();
for(i=1;i<=n;i++)
System.out.println(i*(i+1)/2);
}
}
