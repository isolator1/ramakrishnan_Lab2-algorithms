package com.gl.main;

public class NoteCounter {

	public int[] noteCount(int[] noteArray, int target) {
		int noteCounter[] = new int[noteArray.length];

		for (int i = 0; i < noteCounter.length; i++) {
			if (target >= noteArray[i]) {
				noteCounter[i] = target / noteArray[i];
				target = target - noteCounter[i] * noteArray[i];
			}
		}
		if (target > 0) {
			System.out.println("The exact target amount is not reachable with this denomination");
			return new int[noteArray.length];
		} else {
			System.out.println();
			System.out.println("Your payment approach inorder to give minimum notes will be : -");
			return noteCounter;
		}
	}
}
