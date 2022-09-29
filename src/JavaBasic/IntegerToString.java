package JavaBasic;

public class IntegerToString {

	public static void main(String[] args) {

		int inteiro = 1000;
		
		String s1 = String.valueOf(inteiro);
		System.out.println("1ª Opção de conversão: " + s1);
		
		String s2 = Integer.toString(inteiro);
		System.out.println("2ª Opção de conversão: " + s2);
		
		String s3 = String.format("%d", inteiro);
		System.out.println("3ª Opção de conversão: " + s3); 
		
		System.out.println("4ª Opção de conversão: " + inteiro);
		
		System.out.println("5ª Opção de conversão: " + 1000);
		
		System.out.println("6ª Opção de conversão: " + "1000");
		
	}	
}
