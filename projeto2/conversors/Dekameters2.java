package conversors;

public class Dekameters2 extends AbstractConvert{

    public Dekameters2(String unitName) {
        super(unitName);
        // TODO Auto-generated constructor stu
    }
    public double toMM(double value) {
        return value/Math.pow(10, -8);

    }

    public double toCM(double value) {
        return value/Math.pow(10, -6);

    }

    public double toM(double value) {
        return value/0.01;

    }
    public double toDAM(double value) {
        return value;

    }
    public double  toHM(double value) {
        return value/100;

    }
    public double toKM(double value) {
        return value/10000;

    }
    public double toFutcamp(double value) {
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
