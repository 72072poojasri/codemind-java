import java.util.Scanner;
public class average{
    public static void main(String[] args){
        int num1,num2;
        Scanner read=new Scanner(System.in);
        num1=read.nextInt();
        num2=read.nextInt();
        double res=(num1+num2)/2.0;
        System.out.printf("Average of %d and %d is: %.2f",num1,num2,res);
    }
}