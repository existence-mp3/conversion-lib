package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Slug implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.SLUGS_PER_UNIT;
    }

}
