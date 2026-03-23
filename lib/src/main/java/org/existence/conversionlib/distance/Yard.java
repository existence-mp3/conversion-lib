package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Yard implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.YARDS_PER_UNIT;
    }

}
