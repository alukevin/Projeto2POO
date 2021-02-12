package conversors;


public class Seconds extends AbstractConvert{

    public Seconds(String unitName) {
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

    public static double toS(double value) {
        return value;

    }

    public static double toM(double value) {
        return value/60;

    }
    public static double toH(double value) {
        return value/3600;

    }

    public static double toD(double value) {
        return value/216000;

    }
    public static double toY(double value) {
        return value/12960000;

    }
}
