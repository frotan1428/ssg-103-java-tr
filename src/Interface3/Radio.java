package Interface3;

public interface Radio {
    int x=15;
    public void startRadio();
    public void stopRadio();

    //default keyword kullanarak interface'lerin icinde body'si olan method'lar uretebilirsiniz.
    //Asagidaki non-static method'dur
    default public void next() {
        System.out.println("Radio interface icinde deafult keyword ile method olutruabilir siniz istisna dir.");
    }
}
