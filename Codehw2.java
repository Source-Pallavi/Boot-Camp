

public class Codehw2 {
	public static void main(String[] args) 
	{
		int d=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		boolean k= false;
	       if(m>=3&&m<=6&&d<=31)

		{
			if(m>=3&&d>=20||m<=6&&d<=20)
				k=true;
			else
                         {
                          if(m==4||m==5)
                                k=true;

				k=false;
                        }     

		}
              else
		k=false;
		if(k)
			System.out.println(k);
		else
			System.out.println(k);

	}

}
