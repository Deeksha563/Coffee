import java.util.Scanner;
class Coffee{
static void coffee(int n){
if(n!=0){
n=n*10/100;
if(n!=0)
System.out.println(n+"INR");

else
System.out.println("FREE");
}
}
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
coffee(n);
}
}