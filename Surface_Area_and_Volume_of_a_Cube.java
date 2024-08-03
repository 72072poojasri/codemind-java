import java.util.Scanner;
public class sv{
    public static void main(String[] args){
        int s,area,vol;
        Scanner read=new Scanner(System.in);
        s=read.nextInt();
        area=6*(s*s);
        vol=s*s*s;
        System.out.printf("Surface area = %d and Volume = %d",area,vol);
    }
}