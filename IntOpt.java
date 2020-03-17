import java.util.Scanner;

public class IntOpt {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values: of a ,b ,c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("1 "+(a+b*c));
		System.out.println("2 "+(a*b+c));
		System.out.println("3 "+(c+(a/b)));
		System.out.println("4 "+(a%b+c));
	}

}
