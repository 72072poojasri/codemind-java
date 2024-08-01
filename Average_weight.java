import java.util.Scanner;
public class aw{
    public static void main(String[] args){
        int aw,b1,b2;
        Scanner read=new Scanner(System.in);
        aw=read.nextInt();
        b1=read.nextInt();
        b2=read.nextInt();
        int b3=3*aw-b1-b2;
        System.out.printf("%d",b3);
    }
}