public class PracticeProblem {

public static void main(String args[]) {

	}
		
public static void bubbleSortString(String[] strings) {
    	boolean switched = true; 
    	for (int x = 0; x < strings.length - 1 && switched; x++) {
	switched = false;
        for (int y = 0; y < strings.length - x - 1; y++) {
        if (strings[y].toLowerCase().compareTo(strings[y + 1].toLowerCase()) > 0) {
        switched = true; 
        String temp = strings[y];
        strings[y] = strings[y + 1];
        strings[y + 1] = temp;				
				}
			}
		}
	}
}
