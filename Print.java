# CharRepeat
import java.util.Scanner;


public class Print {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input : ");
		String s=sc.nextLine();
	      char[] ch=s.toCharArray();
	      String s5 = "";
		for(int i=0;i<ch.length;i++)
		{
		if(ch[i]>96&&ch[i]<123 || ch[i]>64&&ch[i]<91 )
		{
			char c=ch[i];
			int d=Integer.parseInt(String.valueOf(ch[i+1]));
		   for(int j=0;j<d;j++)
		   {
			   System.out.print(c);
		   }
		}
	}

}}

