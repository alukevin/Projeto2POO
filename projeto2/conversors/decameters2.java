package conversors;

public class decameters2 extends AbstractConvert{

    public decameters2(String unitName) {
        super(unitName);
        // TODO Auto-generated constructor stu
    }
    public double toMM(double value) {
        return value/Math.pow(10, -8);

    }

    public static double toCM(double value) {
        return value/Math.pow(10, -6);

    }

    public static double toM(double value) {
        return value/0.01;

    }
    public static double toDAM(double value) {
        return value;

    }
    public static double  toHM(double value) {
        return value/100;

    }
    public static double toKM(double value) {
        return value/10000;

    }
    public static double toFutcamp(double value) {
        return value*(toM(7.140));
    }
	@Override
	public double toBasicUnit(double value) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double fromBasicUnit(double value) {
		// TODO Auto-generated method stub
		return 0;
	}

}