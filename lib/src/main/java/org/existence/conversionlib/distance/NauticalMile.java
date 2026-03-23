package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class NauticalMile implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.NAUTICAL_PER_UNIT;
    }

}
