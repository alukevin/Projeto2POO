package project;

import conversors.Centimeter;
import conversors.Centimeter2;
import conversors.CubicCentimeter;
import conversors.CubicDecimetre;
import conversors.CubicMillimeters;
import conversors.Milimeter;
import conversors.Minutes;
import conversors.Seconds;
import conversors.decameters2;
import conversors.hectameters2;
import conversors.Decimeters;
import conversors.Decimeters2;
import conversors.Dekameters;
import conversors.Hectometers;
import conversors.Hours;
import conversors.Kilometers;
import conversors.KilometersPerHour;
import conversors.Meter2;
import conversors.MeterPerSecond;
import conversors.Meters;

public class convocaFuncao {

	
	public static double defineFunctionLenght(int from, int to, double var) {
		System.out.println(from);
		System.out.println(to);
		from=from+1;
		to=to+1;
		if(from==1 && to ==1) return Milimeter.toMM(var);if(from==1 && to ==2) return Milimeter.toCM(var);if(from==1 && to ==3) return Milimeter.toDM(var);if(from==1 && to ==4) return Milimeter.toM(var);if(from==1 && to ==5) return Milimeter.toDAM(var);		if(from==1 && to ==6) return Milimeter.toHM(var);	if(from==1 && to ==7) return Milimeter.toKM(var);	
		if(from==2 && to ==1) return Centimeter.toMM(var);if(from==2 && to ==2) return Centimeter.toCM(var);if(from==2 && to ==3) return Centimeter.toDM(var);if(from==2 && to ==4) return Centimeter.toM(var);if(from==2 && to ==5) return Centimeter.toDAM(var);if(from==2 && to ==6) return Centimeter.toHM(var);if(from==2 && to ==7) return Centimeter.toKM(var);
		if(from==3 && to ==1) return Decimeters.toMM(var);if(from==3 && to ==2) return Decimeters.toCM(var);if(from==3 && to ==3) return Decimeters.toDM(var);if(from==3 && to ==4) return Decimeters.toM(var);if(from==3 && to ==5) return Decimeters.toDAM(var);if(from==3 && to ==6) return Decimeters.toHM(var);if(from==3 && to ==7) return Decimeters.toKM(var);
		if(from==4 && to ==1) return Meters.toMM(var);if(from==4 && to ==2) return Meters.toCM(var);if(from==4 && to ==3) return Meters.toDM(var);if(from==4 && to ==4) return Meters.toM(var);if(from==4 && to ==5) return Meters.toDAM(var);if(from==4 && to ==6) return Meters.toHM(var);if(from==4 && to ==7) return Meters.toKM(var);
		if(from==5 && to ==1) return Dekameters.toMM(var);if(from==5 && to ==2) return Dekameters.toCM(var);if(from==5 && to ==3) return Dekameters.toDM(var);if(from==5 && to ==4) return Dekameters.toM(var);if(from==5 && to ==5) return Dekameters.toDAM(var);if(from==5 && to ==6) return Dekameters.toHM(var);if(from==5 && to ==7) return Dekameters.toKM(var);
		if(from==6 && to ==1) return Hectometers.toMM(var);if(from==6 && to ==2) return Hectometers.toCM(var);if(from==6 && to ==3) return Hectometers.toDM(var);if(from==6 && to ==4) return Hectometers.toM(var);if(from==6 && to ==5) return Hectometers.toDAM(var);if(from==6 && to ==6) return Hectometers.toHM(var);if(from==6 && to ==7) return Hectometers.toKM(var);
		if(from==7 && to ==1) return Kilometers.toMM(var);if(from==7 && to ==2) return Kilometers.toCM(var);if(from==7 && to ==3) return Kilometers.toDM(var);if(from==7 && to ==4) return Kilometers.toM(var);if(from==7 && to ==6) return Kilometers.toDAM(var);if(from==7 && to ==7) return Kilometers.toHM(var);if(from==7 && to ==7) return Kilometers.toKM(var);
		
		return 0;
	}
public static double defineFunctionArea(int from, int to, double var) {
	from=from+1;
	to=to+1;
		if(from ==8  && to ==8) return Centimeter2.toCM(var);  if(from ==8  && to ==9) return Centimeter2.toDM(var); if(from ==8  && to ==10) return Centimeter2.toM(var);if(from ==8  && to ==11) return Centimeter2.toDAM(var);if(from ==8  && to ==12) return Centimeter2.toHM(var);if(from ==8  && to ==13) return Centimeter2.toHM(var);if(from ==8  && to ==14) return Centimeter2.toFutcamp(var);
		if(from ==9  && to ==8) return Decimeters2.toCM(var);  if(from ==9  && to ==9) return Decimeters2.toDM(var); if(from ==9  && to ==10) return Decimeters2.toM(var);if(from ==8  && to ==11) return Decimeters2.toDAM(var);if(from ==9  && to ==12) return Decimeters2.toHM(var);if(from ==9  && to ==13) return Decimeters2.toHM(var);if(from ==9  && to ==14) return Decimeters2.toFutcamp(var);
		if(from ==10  && to ==8) return Meter2.toCM(var);      if(from ==10 && to ==9) return Meter2.toDM(var); 	 if(from ==10  && to ==10) return Meter2.toM(var);	  if(from ==10  && to ==11) return Meter2.toDAM(var);if(from ==10  && to ==12) return Meter2.toHM(var);if(from ==10  && to ==13) return Meter2.toHM(var);if(from ==10  && to ==14) return Meter2.toFutcamp(var);
		if(from ==11  && to ==8) return decameters2.toCM(var); if(from ==11  && to ==9) return decameters2.toDAM(var); if(from ==11  && to ==9) return decameters2.toM(var);if(from ==11  && to ==10) return decameters2.toDAM(var);if(from ==11  && to ==11) return decameters2.toHM(var);if(from ==11  && to ==12) return decameters2.toHM(var);if(from ==11  && to ==13) return decameters2.toFutcamp(var);
		if(from ==12  && to ==8) return hectameters2.toCM(var); if(from ==12  && to ==9) return hectameters2.toDAM(var); if(from ==12  && to ==10) return hectameters2.toM(var);if(from ==12  && to ==11) return hectameters2.toDAM(var);if(from ==12  && to ==12) return hectameters2.toHM(var);if(from ==12  && to ==13) return hectameters2.toHM(var);if(from ==12  && to ==14) return hectameters2.toFutcamp(var);
		
		
		return 0;
	}

public static double defineFunctionVol(int from, int to, double var) {
	from=from+1;
	to=to+1;
	System.out.println(from);
	System.out.println(to);
	if(from ==16  && to ==16) return CubicMillimeters.toCMM(var);   if(from ==16  && to ==17) return CubicMillimeters.toCCM(var); if(from ==16  && to ==18) return CubicMillimeters.toCD(var);    if(from ==16  && to ==19) return CubicMillimeters.toCM(var);if(from ==16  && to ==20) return CubicMillimeters.toCDa(var);if(from ==16  && to ==21) return CubicMillimeters.toCH(var);if(from ==16  && to ==22) return CubicMillimeters.toCK(var);
	if(from ==17  && to ==16) return CubicDecimetre.toCMM(var);  	if(from ==17  && to ==17) return CubicDecimetre.toCCM(var);   if(from ==17  && to ==18) return CubicDecimetre.toCD(var);      if(from ==17  && to ==19) return CubicDecimetre.toCM(var);if(from ==17  && to ==20) return CubicDecimetre.toCDa(var);if(from ==17  && to ==21) return CubicDecimetre.toCH(var);if(from ==17  && to ==22) return CubicDecimetre.toCK(var);
	if(from ==18  && to ==16) return CubicCentimeter.toCMM(var);    if(from ==18 && to ==17) return CubicCentimeter.toCCM(var);   if(from ==18  && to ==18) return CubicCentimeter.toCCM(var);	  if(from ==18  && to ==19) return CubicDecimetre.toCM(var);if(from ==18  && to ==20) return CubicDecimetre.toCDa(var);if(from ==18  && to ==21) return CubicDecimetre.toCH(var);if(from ==18  && to ==22) return CubicDecimetre.toCK(var);
	
	
	return 0;
}

public static double defineFunctionTime(int from, int to, double var) {
	
	System.out.println(from);
	System.out.println(to);
	if(from ==22  && to ==22) return Seconds.toH(var);   if(from ==22  && to ==23) return Seconds.toM(var);if(from ==22  && to ==24) return Seconds.toH(var);if(from ==22  && to ==25) return Seconds.toD(var);if(from ==22  && to ==26) return Seconds.toY(var);
	if(from ==23  && to ==22) return Minutes.toH(var);   if(from ==23  && to ==23) return Minutes.toM(var);if(from ==23  && to ==24) return Minutes.toH(var);if(from ==23  && to ==25) return Minutes.toD(var);if(from ==23  && to ==26) return Minutes.toY(var);
	if(from ==24  && to ==22) return Hours.toH(var);   if(from ==24  && to ==23) return Hours.toM(var);if(from ==24  && to ==24) return Hours.toH(var);if(from ==24  && to ==25) return Hours.toD(var);if(from ==24  && to ==26) return Hours.toY(var);
	
	
	return 0;
}

public static double defineFunctionSPeed(int from, int to, double var) {
	
	System.out.println(from);
	System.out.println(to);
	if(from ==27  && to ==27) return MeterPerSecond.toMS(var);   if(from ==27  && to ==28) return MeterPerSecond.toKMH(var);
	if(from ==28  && to ==27) return KilometersPerHour.toKMH(var);   if(from ==28  && to ==28) return KilometersPerHour.toMS(var);
	
	return 0;
}
}
