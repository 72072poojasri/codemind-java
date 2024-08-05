import java.util.Scanner;
public class tickets{
    public static void main(String[] args){
        int x;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        if(4*x<=1000){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        read.close();
    }
}