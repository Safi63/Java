public class DataTest{
	public static void main(String[]args){
		
		Data data1 = new Data(01,01,1998);
		System.out.println("Personal Information");
		System.out.printf("%s%s%s%s%s%s\n","Date of birth is: ",data1.getDay(),"/",data1.getMonth(),"/",data1.getYear());
	}
}