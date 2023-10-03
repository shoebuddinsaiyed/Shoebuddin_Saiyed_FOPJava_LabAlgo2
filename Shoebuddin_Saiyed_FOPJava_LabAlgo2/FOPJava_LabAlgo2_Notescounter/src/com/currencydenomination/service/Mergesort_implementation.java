package com.currencydenomination.service;

public class Mergesort_implementation {

	public void conquerArray(int array[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		/* creating temporary arrays */
		int Leftarray[] = new int[n1];
		int Rightarray[] = new int[n2];

		/* copy data to temporary arrays */
		for (int i = 0; i < n1; i++) {
			Leftarray[i] = array[l + i];
		}
		for (int j = 0; j < n2; j++) {
			Rightarray[j] = array[m + 1 + j];
		}
		/* merge the temporary arrays */
		int i = 0;
		int j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (Leftarray[i] >= Rightarray[j]) { // sorting in the descending order
				array[k] = Leftarray[i];
				i++;
			} else {
				array[k] = Rightarray[j];
				j++;
			}
			k++;
		}
		/* copying remaining elements of L[] if any */
		while (i < n1) {
			array[k] = Leftarray[i];
			i++;
			k++;
		}
		/* copying remaining elements of R[] if any */
		while (j < n2) {
			array[k] = Rightarray[j];
			j++;
			k++;
		}
	}

	// main function that helps in sorting the array[left.....right] using merge or
	// conquerArray();
	public void sort(int array[], int l, int r) {
		if (l < r) {
			// finding the middle point
			int m = l + (r - l) / 2;
			// sorting first and second halves

			sort(array, l, m);// for left array
			sort(array, m + 1, r);// for right array
			// merge the sorted halves
			conquerArray(array, l, m, r);

		}
	}

}
