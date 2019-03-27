package codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class BinarySearch {

    public boolean findElementBinarySearch(List<Integer> list, int value) {
        int[] array = new int[list.size()];

        int count = 0;
        for(int i=0; i<list.size(); i++) {
            array[count] = list.get(i);
            count++;
        }

        Arrays.sort(array);

        int lowerBound = 1;
        int upperBound = array.length;

        boolean isFound = false;
        while(isFound != true) {

            if(upperBound < lowerBound) {
                throw new NoSuchElementException("Element not found");
            }

            int midPoint = lowerBound + (upperBound - lowerBound) / 2;

            if(array[midPoint] < value) {
                lowerBound = midPoint + 1;
            }
            if(array[midPoint] > value) {
                upperBound = midPoint - 1;
            }
            if(array[midPoint] == value) {
                isFound = true;
            }
        }
        return isFound;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(6, 11, 45, 2, 13, 15, 4, 8));

        System.out.println(binarySearch.findElementBinarySearch(list, 27));
    }
}
