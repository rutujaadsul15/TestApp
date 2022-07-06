package com.vishal;

import java.util.Arrays;

public class CustomArrayList {
    Integer[] internalArr;
    Integer[] tempArray;
    Integer arraySize = 10;

    public CustomArrayList() {
        internalArr = new Integer[arraySize];
         tempArray = new Integer[arraySize];
    }

    public CustomArrayList(int size) {
        internalArr = new Integer[size];
    }

    public void add(Integer element) {
        //check if array is full?
        long nullSize = Arrays.stream(internalArr).filter(integer -> integer.equals(null)).count();
        if (nullSize > 0) {
            for (int i = 0; i < internalArr.length; i++) {
                if (internalArr[i] == null) {
                    internalArr[i] = element;
                    break;
                }
            }
        }
        //create new array and copy previous array
        this.arraySize = this.arraySize * 2;
        tempArray = internalArr.clone();
        internalArr = new Integer[arraySize];

    }

    public void displayArrayList() {
        Arrays.stream(internalArr).forEach(System.out::println);
    }

}
