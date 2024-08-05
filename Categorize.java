import java.util.Scanner;
public class main{
    public static void main(String[] args){
        float a;
        Scanner read=new Scanner(System.in);
        a=read.nextFloat();
        if(a<150){
            System.out.println("Person is Dwarf.
");
        }
        else if(a>150&&a<=165){
            System.out.println("Person is average heighted.
");
        }
        else if(a>165&&a<=195){
            System.out.println("Person is taller.
");
        }
        else {
            System.out.println("Abnormal height.
");
        }
    }
}