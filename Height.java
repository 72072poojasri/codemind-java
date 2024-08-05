import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int x,y;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        if(x>y){
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }
    }
}