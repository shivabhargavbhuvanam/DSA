package BinarySearch;

import javax.swing.plaf.basic.DefaultMenuLayout;

public class BinarySearch {
    public int ascendingOrderBinarySearch(int[] arr, int element){

        int start = 0;
        int end = arr.length-1;
        int mid;

        while(start<=end){
            mid = start+((end-start)/2);

            if(arr[mid] == element){
                return mid;
            }
            else if(arr[mid] < element){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;
    }
    public int descendingOrderBinarySearch(int[] arr, int element){

        int start = 0;
        int end = arr.length-1;
        int mid;

        while(start<=end){
            mid = start+((end-start)/2);

            if(arr[mid] == element){
                return mid;
            }
            else if(arr[mid] < element){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;
    }

    public int agnosticBinarySearch(int[] arr, int element){

        if(arr.length == 1){
            if(arr[0] == element){
                return 0;
            }
            return -1;
        }
        if(arr[0]<arr[arr.length-1]){
            return ascendingOrderBinarySearch(arr,element);
        }
        else if(arr[0]>arr[arr.length-1]){
            return descendingOrderBinarySearch(arr, element);
        }
        else if(arr[0] == arr[arr.length-1]){
            if(arr[0] == element){
                return 0;
            }
            return -1;
        }
        return -1;
    }
    public int elementFirstOccurrence(int[] arr, int element){
        int size = arr.length;
        int start = 0;
        int end = size-1;
        int result=0;
        while(start<end){
            int mid = start+((end-start)/2);

            if(mid==element){
                if(mid<result){
                    result = mid;
                }

            }
        }

        return -1;
    }
}
