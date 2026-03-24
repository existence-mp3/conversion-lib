package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class MetricTon implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.MTONS_PER_UNIT;
    }

}
