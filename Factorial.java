import java.util.*;
class Factorial
{
public static void main(String args[])
{
int num,n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
num=sc.nextInt();
System.out.print("Factorial:="+fact(num));
}
static int fact(int n)
{
if(n==0)
{
return 1;}
else{
return n*fact(n-1);
}
}
}