package interface4;

public interface Radio {


    int x=15;
    public void startRadio();
    public void stopRadio();

    default public void next() {
        System.out.println("Radio interface icinde deafult keyword ile method olutruabilir siniz istisna dir.");
    }

}
