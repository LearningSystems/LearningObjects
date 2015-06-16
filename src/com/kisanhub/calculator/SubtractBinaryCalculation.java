package com.kisanhub.calculator;

public final class SubtractBinaryCalculation implements BinaryCalculation
{
	@Override
	public double calculate(final double left, final double right)
	{
		return left - right;
	}
}
