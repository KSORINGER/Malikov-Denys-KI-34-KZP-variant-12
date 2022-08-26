package lb5;

class Equations {

	public double calculate(int x) throws CalcException {
		double y, rad;
		rad = x * Math.PI / 180.0;
		try {
			y = (Math.sin(rad) / 4 * Math.tan(rad));
			if (y==Double.NaN || y==Double.NEGATIVE_INFINITY ||
					y==Double.POSITIVE_INFINITY || x==0 || x == 360 || x == -360 || x == 180 || x == -180 || 
					 rad==Math.PI/2.0 || rad==-Math.PI/2.0 || rad == 3.0 *Math.PI / 2.0 || rad == -3.0 *Math.PI / 2.0)
				throw new ArithmeticException();
		} catch (ArithmeticException ex) {
			if (rad==Math.PI/2.0 || rad==-Math.PI/2.0 || rad == 3.0 *Math.PI / 2.0 || rad == -3.0 *Math.PI / 2.0 )
				throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
						else if (x==0 || x == 360 || x == -360 || x == 180 || x == -180)
							throw new CalcException("Exception reason: X = 0");
								else
									throw new CalcException("Unknown reason of the exception during exception calculation");
		}
		return y;
	}
}