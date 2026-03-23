package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class AstronomicalUnit implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.ASTRONOMICAL_PER_UNIT;
    }

}
