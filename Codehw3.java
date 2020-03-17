
import java.util.Scanner;

public class Codehw3 {
static double delta;
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter the values of ax*x+bx+c");
double a=sc.nextInt();
double b=sc.nextInt();
double c=sc.nextInt();
delta = b*b - 4*a*c;
System.out.println("Root 1 of x = "+(-b + Math.sqrt(delta))/(2*a));
System.out.println("Root 2 of x = "+(-b - Math.sqrt(delta))/(2*a));
	}


}
