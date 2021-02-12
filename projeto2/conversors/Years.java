package conversors;

public class Years extends AbstractConvert{

    public Years(String unitName) {
        super(unitName);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double toBasicUnit(double value) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public  double fromBasicUnit(double value) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static double toY(double value) {
        return value;
    }

    public static double toS(double value) {
        return value*31557600;
    }

    public static double toM(double value) {
        return value*525960;
    }

    public static double toH(double value) {
        return value*8766;
    }

    public static double toD(double value) {
        return value*365.25;
    }
}
