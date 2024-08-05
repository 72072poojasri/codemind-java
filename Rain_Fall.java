import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int x;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        if(x<3) System.out.println("LIGHT");
        else if(x>=3&&x<7) System.out.println("MODERATE");
        else System.out.println("HEAVY");
    }
}