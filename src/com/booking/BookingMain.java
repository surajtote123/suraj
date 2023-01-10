package com.booking;

import java.util.Scanner;

import javax.activity.InvalidActivityException;

public class BookingMain {
	
	public static void main(String[] args) throws InvalidActivityException {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the type of AC class");
		String input=sc.nextLine();
		
		Booking b=BookingFactory.createBooking(input);
		
		System.out.println(b.getAcClass());
		
	}

}
