

public class DayOfWeek {
	public static void main(String[] args) 
	{
			int dd=Integer.parseInt(args[0]);
			int mm=Integer.parseInt(args[1]);	
			int yyyy=Integer.parseInt(args[2]);
			DayOfWeek d= new DayOfWeek();
			DayOfWeek.Date date= d.new Date(dd,mm,yyyy);
			DayOfWeek.Date date1= d.new Date(12,02,1996);
			int count=date.noOfDays();
			int count1=date.noOfDays();
	System.out.println(count);
	System.out.println(count1);
	}
	public class Date
	{
		int dd,mm,yyyy;
		final int m[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		public Date(int dd,int mm,int yyyy)
		{
			this.dd=dd;
			this.mm=mm;
			this.yyyy=yyyy;
		}
		public int noOfDays()
		{
			int days=yyyy*365;
			for(int i=1;i<=mm;i++)
			{
				days+=m[i];
			}
			if(mm>2)
				days+=(yyyy)/4-(yyyy)/100+(yyyy)/400;
			else
				days+=(yyyy-1)/4-(yyyy)/100+(yyyy-1)/400;
			return days+dd;
		}static String toString()
		{
			return " "+dd+"."+mm+"."+yyyy+" ";
		}
		
	}
}


