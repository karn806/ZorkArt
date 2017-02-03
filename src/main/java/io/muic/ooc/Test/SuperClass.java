package io.muic.ooc.Test;

/**
 * Created by karn806 on 2/1/17.
 */
public class SuperClass {
    private String str;
    private int n;

    public SuperClass(String str, int n) {
        this.str = str;
        this.n = n;
    }

    public String getStr() {
        return str;
    }

    public int getN() {
        return n;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setN(int n) {
        this.n = n;
    }
}
