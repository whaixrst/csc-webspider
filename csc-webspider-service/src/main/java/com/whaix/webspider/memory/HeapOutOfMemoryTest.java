package com.whaix.webspider.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanghaixin on 16/1/18.
 */
public class HeapOutOfMemoryTest {
    public static void main(String[] args) {
        List<Object> list=new ArrayList<Object>();
        while(true){
            list.add(new Object());
        }
    }

}
