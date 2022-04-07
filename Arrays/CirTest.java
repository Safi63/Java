public class CirTest
{
	public static void main(String[] args)
	{
		CirClass[] circle = new CirClass[args.length];
		for(int x = 0; x < args.length; x++){
			System.out.println(args[x]);
			
			circle[x] = new Circle(Integer.parseInt(args[x]));
			System.out.println(circle[x].getArea()); //isi tareeka sa baki bhi print krny hain
			System.out.println(circle[x].getCircum());
			 
		}
			System.out.println(Circle.getAreaAverage(circle)); 
			System.out.println(Circle.getCircumAverage(circle));
	}
}