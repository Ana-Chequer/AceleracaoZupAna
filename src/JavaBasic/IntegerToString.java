package JavaBasic;

public class IntegerToString {

	public static void main(String[] args) {

		int inteiro = 1000;
		
		String s1 = String.valueOf(inteiro);
		System.out.println("1� Op��o de convers�o: " + s1);
		
		String s2 = Integer.toString(inteiro);
		System.out.println("2� Op��o de convers�o: " + s2);
		
		String s3 = String.format("%d", inteiro);
		System.out.println("3� Op��o de convers�o: " + s3); 
		
		System.out.println("4� Op��o de convers�o: " + inteiro);
		
		System.out.println("5� Op��o de convers�o: " + 1000);
		
		System.out.println("6� Op��o de convers�o: " + "1000");
		
	}	
}
