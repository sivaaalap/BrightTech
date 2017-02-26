import java.io.*;
import java.util.*;
class Sum{
public static void main(String args[]){
int sum=0;
int n,i;
Scanner in=new Scanner(System.in);
n=in.nextInt();
for(i=1;i<=n;i++)
sum+=i;
System.out.println("N number Sum is :"+sum);
}
}
