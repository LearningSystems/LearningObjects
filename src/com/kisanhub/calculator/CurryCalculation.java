package com.kisanhub.calculator;

public final class CurryCalculation
{
	public static UnaryCalculation curry(final BinaryCalculation binaryCalculation, final double left)
	{
		return new UnaryCalculation()
		{
			@Override
			public double apply(double right)
			{
				return binaryCalculation.calculate(left, right);
			}
		};
	}
}
