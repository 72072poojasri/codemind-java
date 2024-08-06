import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        if(n%2==1) System.out.println("weird");
        else if(n%2==0&&n>2&&n<5) System.out.println("not weird");
        else if(n%2==0&&n>6&&n<20) System.out.println("weird");
        else if(n>20) System.out.println("not weird");
        else System.out.println("
");
    }
}