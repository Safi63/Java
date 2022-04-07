// Shape2dTest.java

public class Shape2dTest
{
	public static void main(String[] args)
	{
		double totalArea=0;
		double totalPeremeter=0;
		Rectangle r1 = new Rectangle(2, 3, 4, 5); 
		Circle c1 = new Circle(2, 3, 5, 3.14);
		Triangle t1 = new Triangle(2, 3, 5, 4, 3); 

		System.out.printf("Shapes\t\t\t Areas\t\t peremeters:%n%n");
		
		System.out.printf("Rectangle:\t\t %.2f\t\t %.2f%n%n",r1.area(), r1.peremeter());
		System.out.printf("Circle:\t\t\t %.2f\t\t %.2f%n%n", c1.area(), c1.peremeter());
		System.out.printf("Triangle:\t\t %.2f\t\t %.2f%n%n", t1.area(), t1.peremeter());
		
		// totalArea = r1.area() + c1.area() + t1.area();
		 // totalPeremeter = r1.peremeter() + c1.peremeter() + t1.peremeter()  ;
		 // System.out.printf("Total areas of Shapes:%.2f%n%n",totalArea);
		 // System.out.printf("Total peremeters of Shapes:%.2f%n%n", totalPeremeter);

		 Shape2d[] shapes = new Shape2d[3];
		
		 shapes[0] = r1; 
		 shapes[1] = t1; 
		 shapes[2] = c1; 
		
		 System.out.printf("2D Shapes Areas and Peremeters are follwing:%n%n");
					
		  for (Shape2d currentShape : shapes)
		 {
				totalArea += currentShape.area();
				
				totalPeremeter += currentShape.peremeter();
			 
			 if(currentShape instanceof Circle)
			 {
				 Circle c2 = (Circle) currentShape;
					
				 c2.setRadius(50 * c2.getRadius());
				
				 System.out.printf(" 5o times Radius: %d%n%n", c2.getRadius());
			 } // end if
			
								
		 }  // end for loop 
			System.out.printf("Total Areas:%.2f%n%n",totalArea);
			System.out.printf("Total Peremeters:%.2f%n%n",totalPeremeter);
	}  // end main 
}   // end class Shape2dTest