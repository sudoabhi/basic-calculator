package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO -- start your code here
    private int arg1=0;
    private int arg2=0;

    public Subtract(int arg1, int arg2){
        this.arg1=arg1;
        this.arg2=arg2;
    }

    public int getArg1() {
        return arg1;
    }

    public int getArg2() {
        return arg2;
    }

    public void setArg1(int arg1) {
        this.arg1 = arg1;
    }

    public void setArg2(int arg2) {
        this.arg2 = arg2;
    }

    @Override
    public String toString() {
        return String.valueOf(arg1 - arg2);
    }
}
