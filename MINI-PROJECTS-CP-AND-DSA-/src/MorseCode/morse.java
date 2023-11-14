
import java.util.HashMap;
import java.util.Scanner;
public class morse{
    public static void morse_to_text(){
         // Converts Morse code to text
        HashMap <String,Character> morse_to_text=new HashMap<>();
        morse_to_text.put(".-",'A');
        morse_to_text.put("-...",'B');
        morse_to_text.put("-.-.",'C');
        morse_to_text.put("-..",'D');
        morse_to_text.put(".",'E');
        morse_to_text.put("..-.",'F');
        morse_to_text.put("--.",'G');
        morse_to_text.put("....",'H');
        morse_to_text.put("..",'I');
        morse_to_text.put(".---",'J');
        morse_to_text.put("-.-",'K');
        morse_to_text.put(".-..",'L');
        morse_to_text.put("--",'M');
        morse_to_text.put("-.",'N');
        morse_to_text.put("---",'O');
        morse_to_text.put(".--.",'P');
        morse_to_text.put("--.-",'Q');
        morse_to_text.put(".-.",'R');
        morse_to_text.put("...",'S');
        morse_to_text.put("-",'T');
        morse_to_text.put("..-",'U');
        morse_to_text.put("...-",'V');
        morse_to_text.put(".--",'W');
        morse_to_text.put("-..-",'X');
        morse_to_text.put("-.--",'Y');
        morse_to_text.put("--..",'Z');
        morse_to_text.put( ".----",'1');
        morse_to_text.put("..---",'2');
        morse_to_text.put("...--",'3');
        morse_to_text.put("....-",'4');
        morse_to_text.put(".....",'5');
        morse_to_text.put("-....",'6');
        morse_to_text.put("--...",'7');
        morse_to_text.put("---..",'8');
        morse_to_text.put("----.",'9');
        morse_to_text.put("-----",'0');
        morse_to_text.put(" ", ' ');
        System.out.println("Enter the morse code with space for letter:");
        Scanner sc=new Scanner(System.in);
        
        String morse=sc.nextLine();
         // Split Morse code into individual codes
        String[] morseArr = morse.split(" ");
        StringBuilder res = new StringBuilder();
        // Convert each Morse code to text
        for(String m: morseArr){
            
            res.append(morse_to_text.get(m));
         

        }
        System.out.println(morse+"in text is "+res);
        
        

    }
     // Converts text to Morse code
    public static void text_to_morse(){
        HashMap <Character,String> map=new HashMap<>();
        map.put('A',".-");
        map.put('B',"-...");
        map.put('C',"-.-.");
        map.put('D',"-..");
        map.put('E',".");
        map.put('F',"..-.");
        map.put('G',"--.");
        map.put('H',"....");
        map.put('I',"..");
        map.put('J',".---");
        map.put('K',"-.-");
        map.put('L',".-..");
        map.put('M',"--");
        map.put('N',"-.");
        map.put('O',"---");
        map.put('P',".--.");
        map.put('Q',"--.-");
        map.put('R',".-.");
        map.put('S',"...");
        map.put('T',"-");
        map.put('U',"..-");
        map.put('V',"...-");
        map.put('W',".--");
        map.put('X',"-..-");
        map.put('Y',"-.--");
        map.put('Z',"--..");
        map.put( '1',".----");
        map.put('2',"..---");
        map.put('3',"...--");
        map.put('4',"....-");
        map.put('5',".....");
        map.put('6',"-....");
        map.put('7',"--...");
        map.put('8',"---..");
        map.put('9',"----.");
        map.put('0',"-----");
        map.put(' '," ");

        System.out.println("Enter the text you want to convert:");
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        // Convert each character to Morse code
        char[] textArr=text.toUpperCase().toCharArray();
        StringBuilder res=new StringBuilder();
        for(char t:textArr){
            res.append(map.get(t)+" ");
        }
        System.out.println(text+"in morse code is"+res);

    }
    public static void main(String[] args) {
        while(true){
            int choice;
            Scanner sc=new Scanner(System.in);
            //User menu
            System.out.println("MENU");
            System.out.println("Type 1 to convert Text to morse code");
            System.out.println("Type 2 to convert morse code to text");
            System.out.println("Type 3 to exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:text_to_morse();
                break;
                case 2:morse_to_text();
                break;
                case 3:
                System.out.println("Exiting..");
                System.exit(0);
                break;
                default:System.out.println("Invalid choice. Please try again.");
                
            }

        }
    }
}


