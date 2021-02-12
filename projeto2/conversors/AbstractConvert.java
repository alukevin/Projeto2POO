package conversors;

import java.util.ArrayList;

public abstract class AbstractConvert {
	private final String unitName;
	

	public AbstractConvert(String unitName) {
		this.unitName = unitName;
	}

	public abstract double toBasicUnit(double value);

	public abstract double fromBasicUnit(double value);

	@Override
	public String toString() {
		return unitName;
	}
	
	
}
