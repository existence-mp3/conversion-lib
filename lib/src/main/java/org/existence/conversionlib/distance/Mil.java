package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Mil implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.MILS_PER_UNIT;
    }

}
