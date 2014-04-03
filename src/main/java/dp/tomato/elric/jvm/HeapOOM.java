package dp.tomato.elric.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args: -Xmx100M -Xms100M
 * @author elric.wang
 */
public class HeapOOM {

    public static void main(String[] args) {
        List<HeapOOM> list = new ArrayList<HeapOOM>();
        while (true) {
            list.add(new HeapOOM());
        }
    }
}
