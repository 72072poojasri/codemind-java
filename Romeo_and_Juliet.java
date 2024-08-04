import java.util.Scanner;
public class rj{
    public static void main(String[] args){
        int x,y,z;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        z=read.nextInt();
        int res=(x*5+y*10)/z;
        System.out.printf("%d",res);
    }
}