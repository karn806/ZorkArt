package io.muic.ooc.Test;

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
        if (s.contains(" ")){
            System.out.println("yay");
        }

    }
}
