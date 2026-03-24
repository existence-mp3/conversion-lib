package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Dram implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.DRAMS_PER_UNIT;
    }

}
