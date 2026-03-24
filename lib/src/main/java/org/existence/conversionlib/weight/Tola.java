package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Tola implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.TOLAS_PER_UNIT;
    }

}
