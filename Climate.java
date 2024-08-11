import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int a;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        if(a>20) System.out.println("HOT");
        else System.out.println("COLD");
    }
}