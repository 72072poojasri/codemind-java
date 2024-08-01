import java.util.Scanner;
public class pp{
    public static void main(String[] args){
        int x,y;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        double res=y-x;
        double pp=(res*100.0)/x;
        System.out.printf("%.2f",pp);
    }
}