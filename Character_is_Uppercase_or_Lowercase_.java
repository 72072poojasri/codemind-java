import java.util.Scanner;
public class main{
    public static void main(String[] args){
        char ch;
        Scanner read=new Scanner(System.in);
        ch=read.next().charAt(0);
        if(ch>='A'&&ch<='Z') System.out.println("uppercase alphabet");
        else if(ch>='a'&& ch<='z') System.out.println("lowercase alphabet");
        else System.out.println("not an alphabet");
    }
}