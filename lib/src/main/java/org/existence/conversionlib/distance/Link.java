package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Link implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.LINKS_PER_UNIT;
    }

}
