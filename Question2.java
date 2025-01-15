/*
Question 2 (20 points): Write Java code for selection sort algorithm.
 */
import java.util.Comparator;

public class Question2 {
     
    // The selection sort algorith
    public static <E> void selectionSort(E[] list, Comparator</*? super */E> comp) {
    
     E temp = list[1];
     int tempindex = 0;
      for (int k = 0; k < list.length; k++) {
          
        // This loop will find the minimum element of each subset in the array  
        for (int i = k; i < list.length - 1; i++) {
            
            
           //Uses the compare method which is passed from the circ comparable object.
            switch(comp.compare(list[i], list[i + 1])) {
                //Check which value is larger and set temp equal to that value
                case  1: temp = list[i];
                         tempindex = i;
                         break;
                case  0: temp = list[i];
                         tempindex = i;
                         break;
                case -1: temp = list[i+1];
                         tempindex = i+1;
                         break;
            } 
            
        }
        // Places
        list[tempindex] = list[k];
        list[k] = temp;
      }
    }

        
    
    
    
    public static void main(String[] args) {
        
       CircleComparer circ = new CircleComparer(); 
       Circle[] a = {new Circle(5), new Circle(1), new Circle(3), new Circle(4), new Circle(2)}; 
       //Displays radii of circles before sorting
       for( int i = 0; i < a.length; i++ )
            System.out.println(a[i]);
       
        System.out.println("Break");
       
       selectionSort(a, circ);
       
       //Displays radii of circles after sorting
       for( int i = 0; i < a.length; i++ )
            System.out.println(a[i]);
    }
}

