package Abstraction4;

public class Profit extends Calculator{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public int product(int a, int b) {
        return a*b;
    }

    @Override
    public int didived(int a, int b) {
        return a/b;
    }
}
