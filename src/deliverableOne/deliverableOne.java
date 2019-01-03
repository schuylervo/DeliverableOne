package deliverableOne;
import java.util.Scanner; 

public class deliverableOne {

 
    public static void main(String args[])
    {
        
        String eventType;
        String prepSuggestion;
        String mealType;
        String result;
        int partySize;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Welcome to Event Planner. Please enter the number of people in your party: ");
        partySize = scnr.nextInt();
        
        System.out.println("Thanks. Please enter whether the event is 'casual', 'semi-formal', or 'formal': ");
        eventType = scnr.next();
        
        if (partySize <= 1) {
            prepSuggestion = "heated in the microwave";
            
        }
            else if (partySize >= 2 && partySize <= 12) { 
                prepSuggestion = "prepared in your kitchen";
            }
              else {
                prepSuggestion = "prepared by a caterer";
              }
            
                   
        if (eventType.equals("casual")) {
            mealType = "sandwiches";
      }
          else if (eventType.equals("semi-formal")) {
              mealType = "fried chicken";
          }
        else  {
              mealType = "chicken parmesan";
          }
               
      result = "Since you are hosting a " + eventType + " event for " + partySize + " person(s), you should serve " + mealType + " "+ prepSuggestion + ".";
      System.out.println(result);
              
    }
}