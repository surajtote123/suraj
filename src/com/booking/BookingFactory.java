package com.booking;

import javax.activity.InvalidActivityException;

public class BookingFactory {
	
	public static Booking createBooking(String input) throws InvalidActivityException
	{
		
		if(input.equalsIgnoreCase("first"))
		{
			return new FirstTier();
		}
		
		else if(input.equalsIgnoreCase("second"))
		{
			return new SecondTier();
		}
		
		else if(input.equalsIgnoreCase("third"))
		{
			return new ThirdTier();
		}
		
		throw new InvalidActivityException("Invalid input");
	}

}
