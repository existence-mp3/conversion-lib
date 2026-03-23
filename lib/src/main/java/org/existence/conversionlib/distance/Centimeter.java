package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Centimeter implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.CENTIMETERS_PER_UNIT;
    }

}
