import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int r;
        Scanner read=new Scanner(System.in);
        r=read.nextInt();
        double area=3.14*r*r;
        double perimeter=(2*3.14)*r;
        System.out.printf("%.2f
%.2f
",area,perimeter);
    }
}