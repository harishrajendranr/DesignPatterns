package Mergesort;

import static Mergesort.MergesortAlgo.print_array;

public class Client {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Given array is");
        print_array(arr);
        MergesortAlgo ma = new MergesortAlgo();
        ma.mergesort(arr,0, arr.length-1);
        System.out.println("The sorted array is");
        print_array(arr);


    }
}
