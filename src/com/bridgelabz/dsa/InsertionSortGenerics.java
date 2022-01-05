package com.bridgelabz.dsa;

public class InsertionSortGenerics {

    public <K extends Comparable<K>> K insertionSort(K[] array) {
        for (int i = 0; i < array.length; i++) {
            K temp = array[i];
            int index = i - 1;
            while (index >= 0 && array[index].compareTo(temp) > 0) {
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = temp;
        }
        return null;
    }

    public static void main(String[] args) {
        InsertionSort insertion = new InsertionSort();
        String array[] = {"hi", "how", "are", "you"};
        insertion.insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}