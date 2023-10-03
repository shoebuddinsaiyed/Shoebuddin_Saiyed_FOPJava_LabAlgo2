package com.currencydenomination.service;

public class Notescounter_service {

	public void notesCountImplementation(int array[], int amount) {

		int[] noteCounter = new int[array.length];

		try {
			for (int i = 0; i < array.length; i++) {
				if (amount >= array[i]) {
					noteCounter[i] = amount / array[i];
					amount = amount - noteCounter[i] * array[i];

					if (amount == 0) {
						break;
					}
				}
			}
			if (amount > 0) {
				System.out.println("exact amount cannot be given with the highest demoniations");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < array.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(array[i] + ":" + noteCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + " notes of denomination 0 is invalid");
		}
	}
}
