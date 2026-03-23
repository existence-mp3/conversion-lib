package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Meter implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.METERS_PER_UNIT;
    }

}
