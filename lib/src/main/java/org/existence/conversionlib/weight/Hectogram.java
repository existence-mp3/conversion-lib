package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Hectogram implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.HECTORGRAMS_PER_UNIT;
    }

}
