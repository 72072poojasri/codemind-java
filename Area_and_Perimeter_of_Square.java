import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int s;
        Scanner read=new Scanner(System.in);
        s=read.nextInt();
        int area=s*s;
        int perimeter=4*s;
        System.out.printf("%d ",area);
        System.out.printf("%d ",perimeter);
    }
}