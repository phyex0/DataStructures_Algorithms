package com.company;

import com.company.Algorithms.BubbleSort;
import com.company.Algorithms.LinearSearch;
import com.company.DataStructures.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[]{10,9,9,8,7,5,4,3,2,1};
        BubbleSort.bubbleSort(arr);

        System.out.println(LinearSearch.linearSearch(arr,10));



    }
}
