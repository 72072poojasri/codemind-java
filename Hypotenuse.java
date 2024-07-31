import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int a,b;
        Scanner read= new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        double res;
        res=Math.sqrt(a*a+b*b);
        System.out.println(String.format("%.2f", res));
    }
}