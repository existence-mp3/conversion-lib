package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Pound implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.POUNDS_PER_UNIT;
    }

}
