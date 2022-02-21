package String;

import java.util.Scanner;

public class exercise {

	

//////////////////////////////////////////////////////
	//SWAP TWO STRINGS IN JAVA WITHOUT USING THIRD VARIABLE//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String a = "JAVA";
		  String b = "TRAINING";
		  System.out.println("Before swap: "+ a + " " + b); a = a + b; b = a.substring(0, a.length() - b.length());
		  a =a.substring(b.length()); System.out.println("After : " + a + " " + b);
		 
/////////////////////////////////////////////////////////
    //REVERSING THE STRING//
		StringBuffer s=new StringBuffer("ANONYMOUS ANTEATER");
		s=s.reverse();
		System.out.println(s);
//////////////////////////////////////////////////////////////
	//COUNT THE NUMBER OF WORDS IN A STRING//
	
	  int count=1;
	  String str = "welcome to java training";
	  for (int i = 0; i <str. length() - 1; i++) 
	  {
		  if ((str. charAt(i) == ' ') && (str. charAt(i + 1)!= ' ')) 
	  {
			  count++; 
			  }
	  } 
	  System. out. println("Number of words in a string : "
	  + count);
	 
////////////////////////////////////////////////////////////
	//CONVERT STRING TO INTEGER//
	
	  String str = "25";
	  
	  try{ int number = Integer.parseInt(str); 
	  System.out.println(number); 
	  } catch
	  (NumberFormatException ex){ ex.printStackTrace(); }
	 
		 
///////////////////////////////////////////////////////////
	//REVERSE A STRING WITHOUT USING THE REVERSE METHOD//
	
	 String s; Scanner sc=new Scanner(System.in);
	  System.out.print("Enter a String: ");
	  s=sc.nextLine();
	  System.out.print("After reverse string is: ");
	  for(int i=s.length();i>0;--i)
	  { System.out.print(s.charAt(i-1));
	  
	  }
	 
////////////////////////////////////////////////////////////
    //TO PRINT DUPLICATE CHARACTERS IN STRING//
		String string1 = "Great responsibility";  
        int count1;  
          
        //Converts given string into character array  
        char string[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <string.length; i++) {  
            count1 = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count1++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count1 > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  
	 

	}
}
