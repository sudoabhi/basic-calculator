package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here

    private int arg1=0;
    private int arg2=1;

    public Divide(int arg1,int arg2){
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
        if(arg2!=0){
            return String.valueOf(arg1 / arg2) + " R:" + String.valueOf(arg1 % arg2);
        }
        else
            return "Invalid";
    }
}
