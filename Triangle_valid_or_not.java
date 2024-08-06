import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int a,b,c;
        Scanner read=new Scanner (System.in);
        a=read.nextInt();
        b=read.nextInt();
        c=read.nextInt();
        if(a+b>c && a+c>b && b+c>a) System.out.println("Valid triangle");
        else System.out.println("Invalid triangle");
        
    }
}