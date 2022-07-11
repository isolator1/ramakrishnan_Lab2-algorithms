package com.gl.main;

import java.util.Scanner;

public class FindTargetTransactions {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of transactions per day:-");
		int size = sc.nextInt();
		int[] transactionsArray = new int[size];
		System.out.println("Enter the transactions values now");
		for (int i = 0; i < size;) {
			int transaction = sc.nextInt();
			if (transaction > 0) {
				transactionsArray[i] = transaction;
				i++;
			}
		}
		System.out.println("Enter the total no of targets that needs to be achieved = :-");
		int noOfTargets = sc.nextInt();

		printNumberOfTransactions(transactionsArray, noOfTargets);
	}

	private static void printNumberOfTransactions(int[] transactionsArray, int noOfTargets) {
		while (noOfTargets > 0) {
			System.out.println("Enter the value of daily target = :-");
			int target = sc.nextInt();
			int transactionCount = getNumberOfTransactions(transactionsArray, target);
			if (transactionCount > 0) {
				System.out.println("Target achieved after " + (transactionCount) + " transactions");
				System.out.println();
				noOfTargets--;
			} else {
				System.out.println("Given Target is not achieved");
				noOfTargets--;
			}
		}
	}

	private static int getNumberOfTransactions(int[] transactionsArray, int target) {

		int transactionsCount = 0;
		int sum = 0;
		int size = transactionsArray.length;
		do {
			sum = sum + transactionsArray[transactionsCount];
			transactionsCount++;
		} while (sum <= target && transactionsCount < transactionsArray.length);
		if (transactionsCount < size) {
			return transactionsCount;
		}
		return -1;
	}
}
