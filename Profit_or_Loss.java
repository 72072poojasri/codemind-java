import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        if(b>a) System.out.println("Profit
");
        else if(b==a) System.out.println("No Profit and No Loss");
        else System.out.println("Loss
");
    }
}