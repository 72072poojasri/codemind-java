import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int b,h;
        Scanner read=new Scanner(System.in);
        b=read.nextInt();
        h=read.nextInt();
        int area=(b*h)/2;
        System.out.printf("%d",area);
    }
}