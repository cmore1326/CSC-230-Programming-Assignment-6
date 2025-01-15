import java.util.Comparator;

public class CircleComparer implements Comparator<Circle>{

CircleComparer(){
}
    
@Override
public int compare(Circle o1, Circle o2) {
    int radius1 = o1.getRadius();
    int radius2 = o2.getRadius();

    if (radius1 < radius2){
        return 1; //radius2;
    }
    if (radius1 == radius2){
        return 0; //radius1;
    }
    else
        return -1; //radius1;
 }

 }
    
    
    
    

