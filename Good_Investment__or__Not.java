import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int x,y;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        if(x/2>=y){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}