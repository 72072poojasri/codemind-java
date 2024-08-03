import java.util.Scanner;
public class days{
    public static void main(String[] args){
        int a;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        int year=a/365;
        int week=(a%365)/7;
        System.out.printf("%d
%d
",year,week);
    }
}