package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Milimeter implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.MILIMETERS_PER_UNIT;
    }

}
