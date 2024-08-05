import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int p1,p2,p3,p4;
        Scanner read=new Scanner(System.in);
        p1=read.nextInt();
        p2=read.nextInt();
        p3=read.nextInt();
        p4=read.nextInt();
        if(p1>=10&&p2>=10&&p3>=10&&p4>=10) System.out.println("YES");
        else System.out.println("NO");
    }
}