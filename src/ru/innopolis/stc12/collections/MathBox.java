package ru.innopolis.stc12.collections;

import java.util.Set;
import java.util.TreeSet;

public class MathBox {
    private TreeSet<Integer> enterSet;

    public MathBox(Set<Integer> enterSet) {
        this.enterSet = new TreeSet<Integer>(enterSet);
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "enterSet=" + enterSet +
                '}';
    }
}
