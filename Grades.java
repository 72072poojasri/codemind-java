import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int phy,che,bio,math,cs;
        Scanner read=new Scanner(System.in);
        phy=read.nextInt();
        che=read.nextInt();
        bio=read.nextInt();
        math=read.nextInt();
        cs=read.nextInt();
        float percentage=(phy+che+bio+math+cs)/5;
        if(percentage>=90) System.out.println("Grade A");
        else if(percentage>=80) System.out.println("Grade B");
        else if(percentage>=70) System.out.println("Grade C");
        else if(percentage>=60) System.out.println("Grade D");
        else if(percentage>=40) System.out.println("Grade E");
        else System.out.println("Grade F");
    }
}