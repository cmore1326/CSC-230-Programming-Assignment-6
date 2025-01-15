/*
 Question 3 (20 points): Write Java code for insertion sort algorithm.
 */
import java.util.Comparator;

public class Question3 {
     // The insertion sort algorith
    public static <E> void insertionSort(E[] list, Comparator</*? super */E> comp) {
    
        E temp = list[1];
        int tempindex = 0;
        int k;
         // This loop will find the minimum element of each subset in the array  
        for (int i = 1; i < list.length - 1; i++) {
            //insert list[i] into a sorted sublist list[0..i-1] so that list[0..i] is sorted. 
            E currentElement = list[i];
            
            for ( k = i - 1; k >= 0 && comp.compare(list[k],currentElement)== -1; k--) {
                list[k + 1] = list[k];
                
            }

            // Insert the current element into list[k+1]
            list[k + 1] = currentElement;
        }
         
    }
    
    public static void main(String[] args) {
        
       CircleComparer circ = new CircleComparer(); 
       Circle[] a = {new Circle(5), new Circle(1), new Circle(3), new Circle(4), new Circle(2)}; 
       //Displays radii of circles before sorting
       for( int i = 0; i < a.length; i++ )
            System.out.println(a[i]);
       
        System.out.println("Break");
       
       insertionSort(a, circ);
       
       //Displays radii of circles after sorting
       for( int i = 0; i < a.length; i++ )
            System.out.println(a[i]);
    }
}
