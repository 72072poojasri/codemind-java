import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int x;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        if(x>=18){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}