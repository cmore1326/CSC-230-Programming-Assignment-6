
public class Circle  {
   public int radius;
   
   Circle (){
   }
   
 public Circle(int radius) {
    setRadius(radius);

}

public void setRadius(int n) {
    if (n > 0) {
        this.radius = n;
    }

}

public int getRadius() {
    return this.radius;

}
   

   @Override
   public String toString (){
       return "Circle with the radius: " + radius ;
   }
   
}
