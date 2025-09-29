package JavaPrograms;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ArraySort {
    public static void main(String[] args){

        int arr1[]={10,3,10,8,21,0,1};
        int arr2[]={10,2,3,100,80,39};

        int res[]= IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(res));

    }
}
