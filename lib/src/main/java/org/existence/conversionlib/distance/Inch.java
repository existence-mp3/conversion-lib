package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Inch implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.INCHES_PER_UNIT;
    }

}
