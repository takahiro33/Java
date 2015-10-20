import java.util.*;

public class practice3_1 {

	static String upperCase(String s){
		String rt = s.toUpperCase();
		return rt;
	}
	
	static String hideA(String s){
		String rt = s.replace("a", "*");
		return rt;
	}
	
	static String hideVowel(String s){
		String rt = s.replace("a", "*");
		rt = rt.replace("i", "*");
		rt = rt.replace("u", "*");
		rt = rt.replace("e", "*");
		rt = rt.replace("o", "*");
		return rt;
	}
	
	static String rotate(String s){
		String rt = "\n";
		
		for(int i = 0; i <= s.length(); i++){
			rt += s.substring(i) + s.substring(0, i) + "\n";	
		}
		return rt;
	}
	
	static String triangle(String s){
		String rt = "\n";

		for(int i = s.length(); i >= 0; i--){
			rt += s.substring(0, i) + "\n";	
		}
		return rt;
	}
	
	static String invTriangle(String s){
		String rt = "\n";
		
		for(int i = 0; i <= s.length(); i++){
			
			int j = i;
			while(j != 0){
				rt += " ";
				j--;
			}
			
			rt += s.substring(0, s.length()-i) + "\n";	
		}
		return rt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String string = "";

		System.out.println("input characters");
		string = sc.nextLine();
		System.out.println("a: " + upperCase(string));
		System.out.println("b: " + hideA(string));
		System.out.println("c: " + hideVowel(string));
		System.out.println("d: " + rotate(string));
		System.out.println("e: " + triangle(string));
		System.out.println("f: " + invTriangle(string));
		sc.close();
	}
}
