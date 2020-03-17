import java.util.*;

class Stats5
{
public static void main(String args[])
{

int a1=Math.random();
int a2=Math.random();
int a3=Math.random();
int a4=Math.random();
int a5=Math.random();				

System.out.println((a1+a2+a3+a4+a5)/5+"----Average");
System.out.println(Math.min(a1,a2,a3,a4,a5)+"----Min");
System.out.println(Math.max(a1,a2,a3,a4,a5)+"----Max");
}
}