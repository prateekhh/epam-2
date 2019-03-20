package com.prateek.epam2.CostEstimation;

/*
 * 
 * To find the cost estimation of a house
 * @author Prateek Chauhan
 *
 */
public class CostEstimation {

	int cost;

	/**
	 * 
	 * @param materialStandard
	 * @param area
	 * @param isAutomated
	 * @return
	 */
	public double Cost(double materialStandard, double area, boolean isAutomated) {
		if (materialStandard == 0) // For Standard Materials
		{
			cost = 1200;

		} else if (materialStandard == 1) // For Above Standard Materials
		{
			cost = 1500;
		} else if (materialStandard == 2 && isAutomated) // For High Standard Material and Automated
		{
			cost = 2500;
		} else {
			cost = 1800; // For only High Standard Material
		}

		return (cost * area); // Return Total Cost
	}
}

// End of class CostEstimation
