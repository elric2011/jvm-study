package dp.tomato.elric.jvm;

/**
 * VM Args: -Xss128K
 * @author elric.wang
 */
public class VMStackSOF {

    private int counter = 1;

    private void stackLeak(int c) {
        long a = 0;
        counter++;
        stackLeak(0);
    }

    public static void main(String[] args) {
        VMStackSOF sut = new VMStackSOF();
        try {
            sut.stackLeak(0);
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("StackLength:" + sut.counter);
        }
    }
}
