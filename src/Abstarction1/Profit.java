package Abstarction1;

public  class Profit extends Calculator{

    @Override
    public int add(int a, int b) {
        return -1;
    }

    @Override
    public int subtract(int a, int b) {
        return -1;
    }

    @Override
    public int product(int a, int b) {
        return a*b;
    }

    @Override
    public int divided(int a, int b) {
        return a/b;
    }
}
