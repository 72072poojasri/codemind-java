import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int a;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        if(a%9==0) System.out.println("True
");
        else System.out.println("False
");
    }
}