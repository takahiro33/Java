public class practice3_3 {

	public static void main(String[] args) {
		for(int i = args.length-1; i >= 0; --i){
			System.out.println(args[i]);
		}
		System.out.println();

		
		for(int i = args.length-3; i >= 0; --i){
			System.out.println(args[i]);
		}
		
		for(int i = args.length-2; i < args.length; i++){
			System.out.println(args[i]);
		}

		System.out.println("?\n");

	}
}
