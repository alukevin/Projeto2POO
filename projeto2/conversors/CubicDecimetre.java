package conversors;

public class CubicDecimetre extends AbstractConvert{

    public CubicDecimetre(String unitName) {
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

    public static double toCM(double value) {
        return value;

    }

    public static double toCMM(double value) {
        return value*(1000*1000*1000);

    }
    public static double toCCM(double value) {
        return value*(1000*1000);

    }

    public static double toCD(double value) {
        return value*(1000);

    }
    public static double toCDa(double value) {
        return value/(1000);

    }

    public static double toCH(double value) {
        return value/(10001000);

    }

    public  static double toCK(double value) {
        return value/(1000*1000*1000);
    }
}
