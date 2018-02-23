	import java.util.Scanner;
	class AreaCalculation
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String args[])
	{
		System.out.print("Enter the radius: ");

		double radius =sc.nextDouble();

		double area= Math.PI * (radius*radius);
		double halfArea= area/2;
		System.out.println("The area of the circle is: "+area);
		System.out.print("Half of that area is: "+halfArea);
	}
}
