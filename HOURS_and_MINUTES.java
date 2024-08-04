import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int a,hrs,min;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        hrs=a/60;
        min=a%60;
        System.out.printf("%d Hour(s) %d Minute(s)",hrs,min);
    }
}