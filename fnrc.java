import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
class fnrc {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    try {
        System.out.print("Enter lowercase english alphabets : ");
        String alp = kbd.nextLine();
        int alpLength = alp.length();
        if(alpLength > 0 && alpLength <= 100000) {
           if(validateString(alp)) {
              HashMap <Character,Integer> occurance = new HashMap<>();
              for(int i = 0; i < alpLength; i++) {
                 char ch = alp.charAt(i);
                 if(!(occurance.containsKey(ch)))
                    occurance.put(ch,1);
                 else
                    occurance.put(ch, occurance.get(ch) + 1);
              }
              if(occurance.containsValue(1)) {
                for(Entry<Character, Integer> entry: occurance.entrySet()) {
                  if(entry.getValue() == 1) {
                      System.out.println( entry.getKey() + " is the first non repeating character");
                      break;
                  }
                }
              }
              else 
                 System.out.println("_");
           } 
        }
        else
          System.out.println("Invalid Input");
    } catch(Exception err) {
        System.out.println("Error Occured");
    }
  }
   public static boolean validateString(String str) {
      for (int index = 0; index < str.length(); index++) {
         char ch = str.charAt(index);
         if (!(ch >= 'a' && ch <= 'z')) 
            return false;
      }
      return true;
   }
}