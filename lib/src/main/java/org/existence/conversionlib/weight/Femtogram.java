package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Femtogram implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.FEMTOGRAMS_PER_UNIT;
    }

}
