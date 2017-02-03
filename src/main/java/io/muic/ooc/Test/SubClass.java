package io.muic.ooc.Test;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by karn806 on 2/1/17.
 */
public class SubClass extends SuperClass {

    public SubClass(String str, int n) {
        super(str, n);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("ha");
        list.add("yay");
        list.add("ho");
        list.add("ya");
        Random random = new Random();
        String n = list.get(random.nextInt(list.size()));
        System.out.println(n);


    }
}
