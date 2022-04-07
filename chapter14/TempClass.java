public class TempClass{
	
	private String s3;
	public TempClass(String s3){
		this.s3 = s3;
	}
	
	public String getString(){
		return s3;
	}	
	
	public String toString(){
		return String.format(getString());
	}
}