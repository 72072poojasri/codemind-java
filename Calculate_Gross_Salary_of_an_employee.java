import java.util.Scanner;
public class gs{
    public static void main(String[] args){
        float bs,hra,da;
        Scanner read=new Scanner(System.in);
        bs=read.nextFloat();
        hra=read.nextFloat();
        da=read.nextFloat();
        double pf =(12.0/100)*bs;
        double gs=bs+hra+da+pf;
        System.out.printf("%.2f
%.2f
",pf,gs);
    }
}