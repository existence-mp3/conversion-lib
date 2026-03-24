package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class AtomicMassUnit implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.ATOMIC_PER_UNIT;
    }

}
