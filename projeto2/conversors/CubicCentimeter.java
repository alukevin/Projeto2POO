package conversors;

public class CubicCentimeter extends AbstractConvert{

    public CubicCentimeter(String unitName) {
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

    public static double toCCM(double value) {
        return value;

    }

    public static double toCMM(double value) {
        return value*1000;

    }
    public static double toCD(double value) {
        return value/(1000);

    }

    public static double toCM(double value) {
        return value/(1000*1000);

    }
    public static double toCDa(double value) {
        return value/(1000*1000*1000);

    }

    public double toCH(double value) {
        return value/(1000*1000*1000*1000);

    }

    public double toCK(double value) {
        return value/(1000*1000*1000*1000*1000);

    }
}
