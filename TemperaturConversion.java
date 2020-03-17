
public class TemperaturConversion {
public static void main(String[] args) 
{
	int t=Integer.parseInt(args[0]);
	System.out.println("Celsius to Fahrenheit: " +(t* (9/5)) + 32);
		System.out.println("Fahrenheit to Celsius: " + ((t - 32)*(5/9 )));

}}
