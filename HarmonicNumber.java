
public class HarmonicNumber {
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		for(int i=1;i<=n;i++)
		{ if(i!=n)
			System.out.print(" 1/"+i+" + ");
		else
			System.out.print(" 1/"+i);
		}
	}

}
