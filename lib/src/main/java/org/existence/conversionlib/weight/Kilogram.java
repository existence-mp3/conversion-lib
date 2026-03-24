package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Kilogram implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.KILOGRAMS_PER_UNIT;
    }

}
