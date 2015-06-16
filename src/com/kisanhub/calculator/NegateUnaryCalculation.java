package com.kisanhub.calculator;

public class NegateUnaryCalculation implements UnaryCalculation
{
	@Override
	public double apply(double right)
	{
		return -right;
	}
}
