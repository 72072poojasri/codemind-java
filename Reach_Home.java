import java.util.Scanner;
public class height{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        if(5*a>=b){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}