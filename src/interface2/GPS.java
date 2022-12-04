package interface2;

public interface GPS {

   double x=12;
//    public abstract void getCoordinates();
 void getCoordinates();

 default public void next(){
  System.out.println("GPS  method");
 }


}
