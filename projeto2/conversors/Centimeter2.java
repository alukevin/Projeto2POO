package conversors;
import java.lang.Math;

public class Centimeter2 extends AbstractConvert{

    public Centimeter2(String unitName) {
        super(unitName);
        // TODO Auto-generated constructor stub
    }

  
    @Override
    public double fromBasicUnit(double value) {
        // TODO Auto-generated method stub
        return 0;
    }


    public static double toMM(double value) {
        return value*100;

    }
    public static double toCM(double value) {
        return value;

    }


    public static double toDM(double value) {
        return value*0.01;

    }

    public static double toM(double value) {
        return value*0.0001;

    }
    public static double toDAM(double value) {
        return value * Math.pow(10, -6);

    }
    public static double  toHM(double value) {
        return value * Math.pow(10, -8);

    }
    public static double toKM(double value) {
        return value * Math.pow(10, -10);

    }
    public static double toFutcamp(double value) {
        return value *(toM(7.140));
    }

	@Override
	public double toBasicUnit(double value) {
		// TODO Auto-generated method stub
		return 0;
	}
	}