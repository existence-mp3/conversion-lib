package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Foot implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.FEET_PER_UNIT;
    }

}
