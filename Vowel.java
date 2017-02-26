import java.io.*;
import java.util.*;
class Vowel{
public static void main(String args[])
{
char a;
System.out.println("Enter a Character:");
Scanner in=new Scanner(System.in);
a=in.next().charAt(0);
if(a=='a'|| a=='A' || a=='e' || a=='E' || a=='i' || a=='I' || a=='o' || a=='O' || a=='u' || a=='U')
System.out.println("Vowel");
else
System.out.println("Not Vowel");
}
}
