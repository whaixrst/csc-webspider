package com.whaix.webspider.memory;

/**
 * Created by wanghaixin on 16/1/18.
 */
public class StackOverFlowTest {
    private int stackLength = 1;

    private void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        StackOverFlowTest test = new StackOverFlowTest();
        try {
            test.stackLeak();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
