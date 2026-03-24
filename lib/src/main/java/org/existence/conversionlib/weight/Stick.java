package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Stick implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.STICKS_PER_UNIT;
    }

}
