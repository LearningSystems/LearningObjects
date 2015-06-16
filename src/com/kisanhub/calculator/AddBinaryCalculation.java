package com.kisanhub.calculator;

public final class AddBinaryCalculation implements BinaryCalculation
{
	@Override
	public double calculate(final double left, final double right)
	{
		return left + right;
	}
}
