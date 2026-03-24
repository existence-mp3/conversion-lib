package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Ounce implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.OUNCES_PER_UNIT;
    }

}
