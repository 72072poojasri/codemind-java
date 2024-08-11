import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int c,a,b;
        Scanner read=new Scanner(System.in);
        c=read.nextInt();
        a=read.nextInt();
        b=read.nextInt();
        if(c<=a+2*b) System.out.println("Qualify");
        else System.out.println("Not Qualify");
    }
}