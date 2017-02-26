import java.io.*;
import java.util.*;
class Letter{
public static void main(String args[]){
char ch;
Scanner in=new Scanner(System.in);
System.out.println("Enter a Character:");
ch=in.next().charAt(0);
if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
System.out.println("Is a Character");
else
System.out.println("Is not a Character");
}
}
