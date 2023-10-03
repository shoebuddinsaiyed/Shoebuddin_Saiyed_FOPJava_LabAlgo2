package com.paymoney.service;

import java.util.Scanner;

public class Paymoney_service {

	Scanner scan = new Scanner(System.in);

	// declaring the variables
	int arraysize, targetsum, targetednumber, targetgiven, targetvalue[];
	int[] arrayvalue;
	int flag = 0;

	// creating method for getting array details

	public void arraydetails() {

		System.out.println("Enter the size of transaction array");
		arraysize = scan.nextInt();
		arrayvalue = new int[arraysize];

		System.out.println("Enter the values of array");
		for (int i = 0; i < arraysize; i++) {
			arrayvalue[i] = scan.nextInt();
		}
	}

	// creating method for calculating target

	public void targetcalculations() {
		System.out.println("Enter the total no of targets that needs to be achieved");
		targetednumber = scan.nextInt();
		targetvalue = new int[targetednumber];
		if (targetednumber >= 0) {
			for (int i = 0; i < targetednumber; i++) {
				System.out.println("Enter the target value for " + (i + 1) + " target");
				targetvalue[i] = scan.nextInt();
				targetgiven = targetvalue[i];
				for (int j = 0; j < arraysize; j++) {
					targetsum = targetsum + arrayvalue[j];
					if (targetsum >= targetgiven) {
						System.out.println("Target achieved after " + (j + 1) + " transactions");
						flag = 1;
						break;
					}
				}

				if (flag == 0) {
					System.out.println("Given Target is not acheived");
				}
			}

		}
	}
}
