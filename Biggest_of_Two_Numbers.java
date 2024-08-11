import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        if(a<b) System.out.println(b);
        else System.out.println(a);
    }
}