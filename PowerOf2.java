

public class PowerOf2 
{
public static void main(String[] args)
{
	int c=Integer.parseInt(args[0]);
	for(int i=1;i<c;i++)
		System.out.println(Math.pow(i, c));
}
}
