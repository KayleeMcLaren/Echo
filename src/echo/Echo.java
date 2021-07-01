
package echo;

import java.util.*;

public class Echo {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        ArrayList<String> memory = new ArrayList<String>(); //create an array which will accept string values
        
        while(true) //this is an infinite loop
        {
            memory.add(reader.nextLine()); //adds each string that is entered to the "memory" array
            if((memory.get(memory.size()-1)).equals("CLEAR")) //if the user enters "CLEAR", "memory" will be cleared of the values it contains (and will be empty)
                memory.clear();
            
            else {
                    if((memory.get(memory.size()-1)).equals("END")) //if the user enters "END", the loop will break (and end)
                        break;
            }
            
            System.out.println(memory.toString()); //prints out the "memory" array after each string entered by the user
        }
        
    }
    
}
