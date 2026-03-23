package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Chain implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.CHAINS_PER_UNIT;
    }

}
