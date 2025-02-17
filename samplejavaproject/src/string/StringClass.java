package string;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="hello";
		char character=a.charAt(1);
		
		System.out.println("Character:"+character);
		String name="My name is Annex";
		System.out.println(name.concat(" Antony"));
		
		System.out.println(name.contains("Annex"));
		System.out.println(name.contains("Anu"));
		
		
		String b="HELLO";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		
		String name1="Anu";
		String name2="Dani";
		System.out.println(a.compareTo(b));
		
		
		
		
		
			}

}
