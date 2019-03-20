package com.prateek.epam2.InterestCalculator;

/* 
* @author Prateek Chauhan
*
*/

public class InterestCalculator { /**
	
	/**
	 * SIMPLE INTEREST
	 * @param principle
	 * @param timePeriod
	 * @param rateOfInterest
	 * @return
	 */
	
	public double simpleInterest ( double principle, double timePeriod, double rateOfInterest)
	{
		return ( principle * timePeriod * rateOfInterest/100);
	}
	
	/**
	 * COMPOUND INTEREST
	 * @param principle
	 * @param timeperiod
	 * @param rateofinterest
	 * @return
	 */
	
	public double compoundInterest ( double principle, double timePeriod, double rateOfInterest)
	{
		return principle * (Math.pow( ( 1 + rateOfInterest / 100), timePeriod) );
	}
	
}  // End of the class Interest
