import java.util.Scanner;
public class capacity{
    public static void main(String[] args){
        int T,S,B,res;
        Scanner read=new Scanner(System.in);
        T=read.nextInt();
        S=read.nextInt();
        B=read.nextInt();
        res=T*S*B;
        System.out.printf("%d KB",res);
    }
}