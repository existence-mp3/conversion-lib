package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Stone implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.STONES_PER_UNIT;
    }

}
