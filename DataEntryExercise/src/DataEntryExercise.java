import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class DataEntryExercise {
	
	public static List<String> datalist;
	
    public static void main(String[] args) {

        System.out.println("Java Exercise for Data Entry - Enter Name:");

        datalist = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        //I invoked useDelimiter because the scanner was separating inputs by space
        sc.useDelimiter("\n");
        String name = sc.nextLine();
        boolean WorkingOnList = true;

        System.out.println("\nWelcome " + name);
        
        while(WorkingOnList == true) {
        	System.out.println("\nData Entry List Options (ADD, CLEAR, REMOVE, VIEW)");
            
        	//using chosen option to determine what choice I made
            String chosenOption = sc.nextLine();
            
            if(chosenOption.equals("ADD")) {
            	System.out.println("Data Entry ready. Type 'FINISH' to complete");
            	boolean AddingToList = true;
            	
            	while(AddingToList == true) {
            		String data = sc.nextLine();
            		
            		if(data.equals("FINISH")) {
            			AddingToList = false;
            			System.out.println("You have completed adding data.");
            		}
            		else {
            			datalist.add(data);
            		}
            	}
            }
            else if(chosenOption.equals("CLEAR")) {
            	datalist.clear();
            	System.out.println("All data was cleared:");
            }
            else if(chosenOption.equals("REMOVE")) {
            	System.out.println("Type data set to remove:");
            	String removethis = sc.nextLine();
            	RemoveData(removethis);
            }
            else if(chosenOption.equals("VIEW")) {
            	PrintAllData();
            }
        }
        
        sc.close();
    }
    
    public static void RemoveData(String TaskName) {
    	if(datalist.contains(TaskName)) {
    		datalist.remove(TaskName);
    		System.out.println(TaskName+" was removed.");
    	}
    	else {
    		System.out.println("Could not find that data set.");
    	}
    }
    
    public static void PrintAllData() {
    	
    	System.out.println("\nDATA STORED:");
    	
    	for(int i = 0; i < datalist.size(); i++) {
    		System.out.println(datalist.get(i));
    	}
    	
    	System.out.println("\nData Set Complete");
    }
}
