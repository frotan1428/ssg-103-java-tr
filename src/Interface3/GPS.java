package Interface3;

public interface GPS {

    public void getCoordinates();



    //static keyword kullanarak interface'lerin icinde body'si olan method'lar uretebilirsiniz.
    //Asagidaki method "static method" dur
    public static void myMehtod(){

        System.out.println("static method interface icinde istista dan dir. ");
    }


}
