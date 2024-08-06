import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        int m=n;
        while(n>10)
        n=n/10;
        {
            System.out.printf("%d",n+m%10);
        }
    }
}