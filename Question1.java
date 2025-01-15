
/*
Question 1 (20 points): Write Java code for bubble sort algorithm 
(pick the good one out of the two algorithms we learned in the class).
*/
import java.util.Comparator;


public class Question1 {
    
   // The bubble sort algorith
    public static <E> void bubbleSort(E[] list, Comparator</*? super */E> comp) {
    
        for (int k = 1; k < list.length; k++) {
        for (int i = 0; i < list.length - k; i++) {
            //Uses the compare method which is passed from the circ comparable object.
            if (comp.compare(list[i], list[i + 1]) < 1) {
                // Swap list[i] with list[i + 1]
                E temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;

            }
        }
    }
    }
        
    
    
    
    public static void main(String[] args) {
        
       CircleComparer circ = new CircleComparer(); 
       Circle[] a = {new Circle(5), new Circle(1), new Circle(3), new Circle(4), new Circle(2)}; 
       //Displays radii of circles before sorting
       for( int i = 0; i < a.length; i++ )
            System.out.println(a[i]);
       
        System.out.println("Break");
       
       bubbleSort(a, circ);
       
       //Displays radii of circles after sorting
       for( int i = 0; i < a.length; i++ )
            System.out.println(a[i]);
    }
}