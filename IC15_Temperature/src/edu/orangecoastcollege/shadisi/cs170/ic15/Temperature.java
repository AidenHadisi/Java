package edu.orangecoastcollege.shadisi.cs170.ic15;

public class Temperature {
	private double mDegrees;
	private TemperatureUnit mUnit;

	public Temperature(double degrees, TemperatureUnit unit) {
		mDegrees = degrees;
		mUnit = unit;
	}

	public Temperature inOtherUnit(TemperatureUnit otherUnit)
	{
		if(mUnit == TemperatureUnit.CELSIUS)
		{
			return new Temperature((mDegrees * 9 / 5) + 32, otherUnit);
		}
		else
			return new Temperature((mDegrees - 32) * 5 / 9, otherUnit);
		
	}

	public Temperature() {
		this(0.0, TemperatureUnit.CELSIUS);

	}

	public Temperature(Temperature otherTemperature) {
		this(otherTemperature.mDegrees, otherTemperature.mUnit);
	}

	public double getDegrees() {
		return mDegrees;
	}

	public void setDegrees(double degrees) {
		mDegrees = degrees;
	}

	public TemperatureUnit getUnit() {
		return mUnit;
	}

	public void setUnit(TemperatureUnit unit) {
		mUnit = unit;
	}

	public boolean convertUnits(TemperatureUnit otherUnit) {
		if (mUnit == otherUnit) {
			throw new IllegalArgumentException("Two units cannot be the same.");
		} else {

			setUnit(otherUnit);
			return true;

		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(mDegrees);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((mUnit == null) ? 0 : mUnit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temperature other = (Temperature) obj;
		if (Double.doubleToLongBits(mDegrees) != Double.doubleToLongBits(other.mDegrees))
			return false;
		if (mUnit != other.mUnit)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Temperature [Degrees=" + mDegrees + ", Unit=" + mUnit + "]";
	}

}
