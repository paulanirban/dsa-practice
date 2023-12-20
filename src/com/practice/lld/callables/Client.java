package com.practice.lld.callables;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        ExecutorService es = Executors.newSingleThreadExecutor();
        ArrayCreator arrayCreator = new ArrayCreator(num);

        Future<ArrayList<Integer>> future = es.submit(arrayCreator);

        try {
            ArrayList<Integer> result = future.get();
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            es.shutdown();
        }
    }
}
