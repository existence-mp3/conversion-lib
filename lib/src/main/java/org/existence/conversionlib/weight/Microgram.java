package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Microgram implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.MICROGRAMS_PER_UNIT;
    }

}
