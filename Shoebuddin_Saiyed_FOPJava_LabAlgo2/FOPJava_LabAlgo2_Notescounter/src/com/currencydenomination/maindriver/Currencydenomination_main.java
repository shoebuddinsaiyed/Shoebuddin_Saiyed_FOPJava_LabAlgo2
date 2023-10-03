package com.currencydenomination.maindriver;

import java.util.Scanner;

import com.currencydenomination.service.*;

public class Currencydenomination_main {
	public static void main(String[] args) {

		Mergesort_implementation mergeSortImpelementation= new Mergesort_implementation();
		Notescounter_service notesCount= new Notescounter_service();
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		num=sc.nextInt();
		// taking  the array values from the user
		System.out.println("enter the currency denominations");
		int array[]=new int[num];
		for(int i=0;i<num;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount=sc.nextInt();

		mergeSortImpelementation.sort(array,0,array.length-1);
		notesCount.notesCountImplementation(array,amount);
		//closing of scanner object
		sc.close();
		

	}

}
