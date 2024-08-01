import java.util.Scanner;
public class ao{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        int Sum=a+b;
        int Difference=a-b;
        int Product=a*b;
        int Quotient=a/b;
        int Remainder=a%b;
        System.out.printf("Sum:%d
",Sum);
        System.out.printf("Difference:%d
",Difference);
        System.out.printf("Product:%d
",Product);
        System.out.printf("Quotient:%d
",Quotient);
        System.out.printf("Remainder:%d
",Remainder);
    }
}