import java.util.Scanner;
public class main{
    public static void main(String[] args){
        char ch;
        Scanner read=new Scanner(System.in);
        ch=read.next().charAt(0);
        if(ch=='V') System.out.println("Violet");
        else if(ch=='I') System.out.println("Indigo");
        else if(ch=='B') System.out.println("Blue");
        else if(ch=='G') System.out.println("Green");
        else if(ch=='Y') System.out.println("Yellow");
        else if(ch=='O') System.out.println("Orange");
        else if(ch=='R') System.out.println("Red");
        else System.out.println("-1");
    }
}