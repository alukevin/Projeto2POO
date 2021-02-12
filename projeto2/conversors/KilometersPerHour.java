package conversors;

public class KilometersPerHour extends AbstractConvert{

    public KilometersPerHour(String unitName) {
        super(unitName);
        // TODO Auto-generated constructor stub
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

    public static double toMS(double value) {
        return value;
    }

    public static double toKMH(double value) {
        return value/3.6;
    }
}
