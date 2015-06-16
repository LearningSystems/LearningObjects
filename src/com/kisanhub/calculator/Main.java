package com.kisanhub.calculator;

public class Main
{
	public static void main(String[] args)
	{
		xxx(new AddBinaryCalculation());
	}

	private static void xxx(AddBinaryCalculation calculation)
	{
		calculation.calculate(45, 67);
	}
}
