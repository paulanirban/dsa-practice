package com.anirban.practice.lld.callables;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<ArrayList<Integer>> {
    private final int n;
    public ArrayCreator(int num) {
        this.n = num;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=this.n; i++) {
            list.add(i);
        }
        return list;
    }
}
