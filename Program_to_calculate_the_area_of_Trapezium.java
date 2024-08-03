import java.util.Scanner;
public class main{
    public static void main(String[] args){
        double b1,b2,h;
        Scanner read=new Scanner(System.in);
        b1=read.nextDouble();
        b2=read.nextDouble();
        h=read.nextDouble();
        double res=((b1+b2)/2)*h;
        System.out.printf("%.4f
",res);
    }
}