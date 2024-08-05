import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t;
        Scanner read=new Scanner(System.in);
        t=read.nextInt();
        while(t-->0){
            int a=read.nextInt();
            int b=read.nextInt();
            int c=read.nextInt();
            System.out.println((a+b)*0.5>c?"Yes":"No");
        }
	}
}
