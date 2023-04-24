import java.util.HashMap;
import java.util.Scanner;

//teeeeeeeeeeeeeeeest 

public class Main {
  public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);
        
    System.out.print("What language? \n");
    String languageInput = scanner.nextLine().toLowerCase();
    
    if(languageInput.equals("spanish")){
    System.out.print("What word? \n");
    
    String wordInput = scanner.nextLine().toLowerCase();
        if(wordInput.equals("bla")){
            
        }
      if(englishSpanish.contains(wordInput)){
        HashMap<String, String> englishSpanish = new HashMap<String, String>();
    spanish.put("water", "agua");
    System.out.println(spanish.get("water")); 
      } else if(spanishEnglish.contains(wordInput)){
        HashMap<String, String> spanishEnglish = new HashMap<String, String>();
    spanish.put("agua", "water");
    System.out.println(spanish.get("agua")); 
      } else{
        System.out.println("Your word could not be located in the dictionary"); 
      }
      
    
    } 
    else if(languageInput.equals("german")){

    HashMap<String, String> spanish = new HashMap<String, String>();
    spanish.put("water", "wasser");
    System.out.println(spanish.get("water")); 
    
    } 
    else if(languageInput.equals("french")){

    HashMap<String, String> spanish = new HashMap<String, String>();
    spanish.put("water", "eau");
    System.out.println(spanish.get("water")); 
    
    } 
    else{
        System.out.print("Fuck you");
    }

    //control d down arrow find each entry of a word and go to 
  }
}

// import java.util.HashMap;
// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) {

//    Scanner scanner = new Scanner(System.in);
        
//     System.out.print("What language? \n");
//     String languageInput = scanner.nextLine().toLowerCase();
    
//     if(languageInput.equals("spanish")){
//     System.out.print("What word? \n");
    
    
    
//     String wordInput = scanner.nextLine().toLowerCase();
//         if(wordInput){
            
//         }
//     HashMap<String, String> spanish = new HashMap<String, String>();
//     spanish.put("water", "agua");
//     System.out.println(spanish.get("water")); 
    
//     } 
//     else if(languageInput.equals("german")){

//     HashMap<String, String> spanish = new HashMap<String, String>();
//     spanish.put("water", "wasser");
//     System.out.println(spanish.get("water")); 
    
//     } 
//     else if(languageInput.equals("french")){

//     HashMap<String, String> spanish = new HashMap<String, String>();
//     spanish.put("water", "eau");
//     System.out.println(spanish.get("water")); 
    
//     } 
//     else{
//         System.out.print("Fuck you");
//     }

//     //control d down arrow find each entry of a word and go to 
//   }
// }