import java.util.Scanner;
public class yr{
    public static void main(String[] args)
    {
        int n;
        Scanner read=new Scanner (System.in);
        n=read.nextInt();
        int yr=n%100;
        System.out.printf("%02d
",yr);
    }
}