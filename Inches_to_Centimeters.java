import java.util.Scanner;
public class ic{
    public static void main(String[] args){
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        double res=n*2.54;
        System.out.printf("%.2f",res);
    }
}