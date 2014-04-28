package me.elric.jvm.chap2;

import java.util.ArrayList;
import java.util.List;

    /**
     * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
     * @author elric.wang
     */
    public class RuntimeConstPoolOOM {

        public static void main(String[] args) {
            List<String> list = new ArrayList<String>();
            int i = 0;
            while (true) {
                list.add(("do something to make this string longer" + i++).intern());
            }
        }
    }
