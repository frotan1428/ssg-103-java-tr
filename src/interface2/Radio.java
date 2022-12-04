package interface2;

public interface Radio {

    public void startRadio();
    public void stopRadio();

    default public void next(){
        System.out.println("next radio gps");
    }


}
