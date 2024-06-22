package MainFunction;

import BinarySearch.BinarySearch;

public class dsa {
    public static void main(String[] args){
        int[] occurrenceArr = {0,1,2,5,5,5,6,8,9,20};
        int[] arr = {0,1,2,5,6,8,9,12,14,17,20};
        int[] revArr = {20,17,14,12,9,8,6,5,2,1,0};

        BinarySearch binarySearch = new BinarySearch();

        System.out.println("BINARY SEARCH IN ASCENDING");
        System.out.println(binarySearch.ascendingOrderBinarySearch(arr, 6));
        System.out.println(binarySearch.ascendingOrderBinarySearch(arr, 4));
        System.out.println(binarySearch.ascendingOrderBinarySearch(arr, 14));

        System.out.println("BINARY SEARCH IN DESCENDING");
        System.out.println(binarySearch.descendingOrderBinarySearch(revArr, 6));
        System.out.println(binarySearch.descendingOrderBinarySearch(revArr, 4));
        System.out.println(binarySearch.descendingOrderBinarySearch(revArr, 14));

        System.out.println("BINARY SEARCH IN AGNOSTIC");
        System.out.println(binarySearch.agnosticBinarySearch(revArr, 6));
        System.out.println(binarySearch.agnosticBinarySearch(arr, 4));
        System.out.println(binarySearch.agnosticBinarySearch(arr, 14));

        System.out.println("BINARY SEARCH - ELEMENT FIRST OCCURRENCE");
        System.out.println(binarySearch.elementFirstOccurrence(occurrenceArr, 5));
        System.out.println(binarySearch.elementFirstOccurrence(occurrenceArr, 4));
        System.out.println(binarySearch.elementFirstOccurrence(occurrenceArr, 10));

        System.out.println("BINARY SEARCH - ELEMENT LAST OCCURRENCE");
        System.out.println(binarySearch.elementLastOccurrence(occurrenceArr, 5));
        System.out.println(binarySearch.elementLastOccurrence(occurrenceArr, 4));
        System.out.println(binarySearch.elementLastOccurrence(occurrenceArr, 10));

        System.out.println("BINARY SEARCH - ELEMENT FREQUENCY");
        System.out.println(binarySearch.frequencyOfElements(occurrenceArr, 5));
        System.out.println(binarySearch.frequencyOfElements(occurrenceArr, 4));
        System.out.println(binarySearch.frequencyOfElements(occurrenceArr, 20));

    }
}
