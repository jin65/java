
public class Temperature {
	private double _value;//¼·¾¾¿ÂµµÀúÀå
	public Temperature() {
		_value=0;
	}
	public Temperature(double v) {
		_value=v;
	}
	public double getTemperatureFahrenheit() {
		//¼·¾¾>>È­¾¾
		return((_value*9/5)+32);
	}
	public double getTemperature() {
		//¼·¾¾ ¹ÝÈ¯
		return _value;
	}
	public void setValue(double _value) {
		this._value=_value;
	}
	public boolean equals(Temperature a) {
		return (a._value==this._value);
	}
	public boolean isGreaterThan(Temperature a) {
		return (a._value<=this._value);
	}
	public boolean isLessThan(Temperature a) {
		return (a._value>=this._value);
	}
	public String toString() {
		return (_value+"Àº");
	}
}
