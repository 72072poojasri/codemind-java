import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int eng,math,phy,che,cs;
        Scanner read=new Scanner(System.in);
        eng=read.nextInt();
        math=read.nextInt();
        phy=read.nextInt();
        che=read.nextInt();
        cs=read.nextInt();
        if(eng>34&&math>34&&phy>34&&che>34&&cs>34) System.out.println("PASSED");
        else System.out.println("FAILED");
    }
}