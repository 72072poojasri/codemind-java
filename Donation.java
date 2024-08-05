import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int x,y;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        int c=y-x;
        System.out.printf("%d
",c);
    }
}