package com.aryadeep;

import java.util.Arrays;

public class MergeSort_inplaceApproach {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergesortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void mergesortInPlace(int[] arr, int s, int e) {
        if (e-s == 1) {
            return;
        }
        int mid = (s+e) / 2;
        mergesortInPlace(arr, s, mid);
        mergesortInPlace(arr, mid, e);
        merge(arr,s,mid,e);
    }

    static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining element
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
