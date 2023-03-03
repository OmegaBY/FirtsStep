package lessons.one;

public class Calc {
    private int a;
    private int b = a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if(b == 0){
            System.out.println("Na nol delit nelza!");
        };
        this.b = b;
    }

    public int divide(){
        return getA()/getB();
    }
}
