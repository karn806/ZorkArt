package io.muic.ooc.Test;

import java.util.ArrayList;

/**
 * Created by karn806 on 2/1/17.
 */
public class SubClass extends SuperClass {

    public SubClass(String str, int n) {
        super(str, n);
    }

    public static void main(String[] args) {
        String s = "go north";
        String q = "quit";
//        if (s.contains(" ")){
//            System.out.println("yay");
//        }
//        ArrayList<String> ss = new ArrayList<String>();
        String qq = q.split(" ")[0];
        System.out.println(qq);

//        ArrayList<String> lst = new ArrayList<String>();
//        lst.add("ha");
//        lst.add("yo");
//        System.out.println(lst.get(0));
//        lst.remove(0);
//        System.out.println(lst.get(0));

    }
}
