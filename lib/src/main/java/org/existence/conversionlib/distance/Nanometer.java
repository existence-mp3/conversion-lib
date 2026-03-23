package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Nanometer implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.NANOMETERS_PER_UNIT;
    }

}
