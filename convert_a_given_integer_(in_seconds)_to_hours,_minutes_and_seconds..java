import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int h=a/3600;
        int m=(a%3600)/60;
        int rs=a%60;
        System.out.printf("H:M:S-%d:%d:%d
",h,m,rs);
    }
}