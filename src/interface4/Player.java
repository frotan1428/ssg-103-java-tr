package interface4;

public interface Player {

    int x=12;
    public void pause();
    public void stop();

    default public void next() {
        System.out.println("Player  interface icinde deafult keyword ile method olutruabilir siniz istisna dir.");
    }

}
