public class TestCircle{
	public static void main(String[]args){
		
		Circle circle1 = new Circle(5.5);
		System.out.printf("Area of Circle1 is: %f%n Circumference of Circle1 is: %f%n%n",circle1.getArea(),circle1.getCircum());
		
		Circle circle2 = new Circle(6.9);
		System.out.printf("Area of Circle2 is: %f%n Circumference of Circle2 is: %f%n%n",circle2.getArea(),circle2.getCircum());
		
		System.out.printf("Total area is : %f%n", (circle1.getArea())+(circle2.getArea()));
		System.out.printf("Total Circumference is : %f", (circle1.getCircum())+(circle2.getCircum()));
	}
}