import java.util.*;

public class practice3_2 {

	static String changeCase(String s){
		int i = 0;
		String rt= "";
		
		while(true){
			if(Character.isUpperCase(s.charAt(i))) 
				rt += Character.toLowerCase(s.charAt(i));

			else if(Character.isLowerCase(s.charAt(i))) 
				rt += Character.toUpperCase(s.charAt(i));
			
			else rt += s.charAt(i);
			
			i++;
			if(i == s.length()) break;
		}
		return rt;
	}
	
	static void pldmCheack(String s){
		boolean rt = true;
		int i = 0;
		int j = s.length()-1;
		
		while(i <= j){
			if(s.charAt(i) != s.charAt(j)){
				rt = false;
				break;
			}
			i++;
			j--;
		}
		System.out.println(s + " is a palindrome: " + String.valueOf(rt));
	}
	
	public static void main(String[] args) {
		String st = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("input alphabets ");
		
		st = sc.nextLine();

		System.out.println(changeCase(st));
		pldmCheack(st);

		sc.close();
	}
}
