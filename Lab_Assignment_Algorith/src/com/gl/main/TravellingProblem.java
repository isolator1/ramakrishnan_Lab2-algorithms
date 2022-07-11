package com.gl.main;

import java.util.Scanner;

import com.gl.sorting.MergeSort;

public class TravellingProblem {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the size of currency denominations :-");
		int noOfDenom = sc.nextInt();
		System.out.println("Enter the  currency denomination value:-");
		int[] noteArray = new int[noOfDenom];
		for (int i = 0; i < noOfDenom;) {
			int denomination = sc.nextInt();
			if (denomination != 0) {
				noteArray[i] = denomination;
				i++;
			}
		}
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(noteArray, 0, noteArray.length - 1);

		System.out.println("Enter the amount you want to pay");
		int target = sc.nextInt();
		NoteCounter noteCounter = new NoteCounter();
		int[] noteCounterArray = noteCounter.noteCount(noteArray, target);
		for (int i = 0; i < noteArray.length; i++) {
			if (noteCounterArray[i] != 0) {
				System.out.println(noteArray[i] + ":" + noteCounterArray[i]);
			}
		}
	}
}
