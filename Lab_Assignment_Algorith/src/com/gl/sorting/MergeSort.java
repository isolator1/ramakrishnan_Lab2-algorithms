package com.gl.sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] array = new int[] { 4, 5, 6, 1, 2, 3 };
		System.out.println("Unsorted Input Array:-");
		System.out.println(Arrays.toString(array));
		
		mergeSort(array, 0, array.length - 1);
		System.out.println("Sorted Input Array:-");
		System.out.println(Arrays.toString(array));
	}
	

	public static void merge(int[] array, int left, int mid, int right) {
		int sizeOfLeft;
		int sizeOfRight;
		sizeOfLeft = mid - left + 1;
		sizeOfRight = right - mid;
		int leftArray[] = new int[sizeOfLeft];
		int rightArray[] = new int[sizeOfRight];
		for (int index = 0; index < sizeOfLeft; index++) {
			leftArray[index] = array[left + index];
		}
		for (int index = 0; index < sizeOfRight; index++) {
			rightArray[index] = array[mid + 1 + index];
		}
			int i = 0, j = 0;
			int k = left;
			while (i < sizeOfLeft && j < sizeOfRight) {
				if (leftArray[i] >= rightArray[j]) {
					array[k++] = leftArray[i++];
				} else {
					array[k++] = rightArray[j++];
				}
			}
			while (i < sizeOfLeft) {
				array[k++] = leftArray[i++];
			}
			while (j < sizeOfRight) {
				array[k++] = rightArray[j++];
			}
	}

	public static void mergeSort(int[] array, int left, int right) {
		if (left < right) {
			int mid = (left + right)/ 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array,left,mid,right);
		}
	}
}
