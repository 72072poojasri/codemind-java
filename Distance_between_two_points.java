import java.util.Scanner;
public class dp{
    public static void main(String[] args){
        int x1,y1,x2,y2;
        Scanner read = new Scanner(System.in);
        x1=read.nextInt();
        y1=read.nextInt();
        x2=read.nextInt();
        y2=read.nextInt();
        double res=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.printf("%.4f",res);
    }
}