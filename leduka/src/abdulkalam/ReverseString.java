package abdulkalam;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "abcde";
		String revstr = "";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			
			revstr=revstr+str1.charAt(i);
		}
			
		System.out.print("reverse string is"+revstr);
	}

}
