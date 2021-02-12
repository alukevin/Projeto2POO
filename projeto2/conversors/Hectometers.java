package conversors;

public class Hectometers extends AbstractConvert{

	public Hectometers(String unitName) {
		super(unitName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public  double toBasicUnit(double value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public  double fromBasicUnit(double value) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public static double toMM(double value) {
		return value*100000;
		
	}
	public static double toCM(double value) {
		return value*10000;
		
	}
	
	public static double toDM(double value) {
		return value*1000;
		
	}
	public static double toM(double value) {
		return value*100;
		
	}
	public static double toDAM(double value) {
		return value*10;
		
	}
	public static double toHM(double value) {
		return value;
		
	}
	
	public static double toKM(double value) {
		return value/10;
		
	}
}
