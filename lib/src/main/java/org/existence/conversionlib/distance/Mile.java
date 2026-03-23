package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Mile implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.MILES_PER_UNIT;
    }

}
