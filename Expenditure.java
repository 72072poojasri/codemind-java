import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        if(a>=30*b) System.out.println("YES");
        else System.out.println("NO");
    }
}