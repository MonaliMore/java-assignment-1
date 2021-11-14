package com.technoelevate.javabasics.assignments;

import java.util.Arrays;

public class DeleteDuplicates {
	public static int removeDuplicate(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];       
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
        int arr[] = {10,70,30,90,20,20,30,40,70,50};
        int[] newArr=Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);  
        int length = arr.length;  
        length = removeDuplicate(arr, length);
        for (int i=0; i<length; i++) 
           System.out.print(arr[i]+" ");
        System.out.println();
        for (int i=0; i<newArr.length; i++)  
            System.out.print(newArr[i]+" ");
    }  
}  

