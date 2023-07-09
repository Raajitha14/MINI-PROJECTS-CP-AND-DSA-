import java.util.Scanner;

public class Encode {
	public static void encode(String s, int k) {
        // Method to encode a string
		String newS=""; //new string to store encoded/decoded message
		for(int i=0;i<s.length();i++) {
            //ascii value of every character
		    int ascii=(int) s.charAt(i);
			int shifted;
			if(ascii>=97&&ascii<=122){
				shifted=((ascii+k)-122)%26;
				if (shifted <= 0) {
	                shifted += 26;
	            }
				newS += (char)(96 + shifted);
				
			}
			
		}
		 System.out.println(newS.toString());
	}
	public static void decode(String s,int k) {
        // Method to decode a string
		String newS="";
		for(int i=0;i<s.length();i++) {
		    int ascii=(int) s.charAt(i);
			int shifted;
			if(ascii>=97&&ascii<=122){
				shifted=((ascii-k)-122)%26;
				if (shifted <= 0) {
	                shifted += 26;
	            }
				newS += (char)(96 +shifted);
				
			}
	    }
		System.out.println(newS);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Type encode to encrypt and decode to decrypt:");
		String str=sc.nextLine();
		System.out.println("Type the message:");
		String s=sc.nextLine();
		System.out.println("Enter the number of shifts:");
		int k=sc.nextInt();
        // Perform encoding or decoding based on user's choice
		if(str.equals("encode")) {
		System.out.print("The encoded message is:");
		encode(s,k);
		}
		if(str.equals("decode")) {
			System.out.println("The decoded message is:");
			decode(s,k);
		}

	}

}



