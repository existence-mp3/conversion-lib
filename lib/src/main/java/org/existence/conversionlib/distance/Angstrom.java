package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Angstrom implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.ANGSTROMS_PER_UNIT;
    }

}
