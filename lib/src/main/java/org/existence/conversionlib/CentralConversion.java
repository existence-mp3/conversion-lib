package org.existence.conversionlib;

/**
 * Class where all of the conversion factors are stored
 */
public final class CentralConversion {

    /**
     * Converts from one unit to another
     * 
     * @param input            The amount you have of the first unit
     * @param conversionFactor Conversion factor of the original unit to a central
     *                         unit
     * @param outputFactor     Conversion factor of the central unit to the new
     *                         unit
     * @return The amount you have of the new unit
     */
    public static double conversion(double input, double conversionFactor, double outputFactor) {
        return (input / conversionFactor) * outputFactor;
    }

    /**
     * Conversion factors for units of distance. Uses meters as a central unit
     */
    public final class DistanceConversion {

        // The standard unit is METERS
        public static final double ANGSTROMS_PER_UNIT = 10000000000.0;
        public static final double ASTRONOMICAL_PER_UNIT = 0.00000000006694587;
        public static final double CENTIMETERS_PER_UNIT = 100;
        public static final double CHAINS_PER_UNIT = 0.0497097;
        public static final double DECAMETERS_PER_UNIT = 0.1;
        public static final double DECIMETERS_PER_UNIT = 10;
        public static final double FEET_PER_UNIT = 3.28084;
        public static final double HECTOMETERS_PER_UNIT = 0.01;
        public static final double INCHES_PER_UNIT = 39.37008;
        public static final double KILOMETERS_PER_UNIT = 0.001;
        public static final double LIGHTYEARS_PER_UNIT = 0.0000000000000001057004;
        public static final double LINKS_PER_UNIT = 4.97097;
        public static final double METERS_PER_UNIT = 1.0;
        public static final double MICROMETERS_PER_UNIT = 1000000;
        public static final double MILS_PER_UNIT = 39370.08;
        public static final double MILES_PER_UNIT = 0.0006213712;
        public static final double MILIMETERS_PER_UNIT = 1000.0;
        public static final double NANOMETERS_PER_UNIT = 1000000000.0;
        public static final double NAUTICAL_PER_UNIT = 0.0005399568;
        public static final double PARSECS_PER_UNIT = 0.00000000000000003240756;
        public static final double PICOMETERS_PER_UNIT = 1000000000000.0;
        public static final double RODS_PER_UNIT = 0.1988388;
        public static final double YARDS_PER_UNIT = 1.093613;

    }

    /**
     * Conversion factors for units of weight. Uses kilograms as a central unit
     */
    public final class WeightConversion {

        // The standard unit is KILOGRAMS
        public static final double ATOMIC_PER_UNIT = 602214100000000000000000000.0;
        public static final double CARATS_PER_UNIT = 5000.0;
        public static final double CENTIGRAMS_PER_UNIT = 100000.0;
        public static final double DECIGRAMS_PER_UNIT = 10000.0;
        public static final double DEKAGRAMS_PER_UNIT = 100.0;
        public static final double DRAMS_PER_UNIT = 564.3834;
        public static final double FEMTOGRAMS_PER_UNIT = 1000000000000000000.0;
        public static final double FQUNITALS_PER_UNIT = 0.006713662;
        public static final double GRAINS_PER_UNIT = 15432.36;
        public static final double GRAMS_PER_UNIT = 1000.0;
        public static final double HECTORGRAMS_PER_UNIT = 10.0;
        public static final double HUNDREDWEIGHTS_PER_UNIT = 0.02204623;
        public static final double ITONS_PER_UNIT = 0.0009842065;
        public static final double KILOGRAMS_PER_UNIT = 1.0;
        public static final double MEGAGRAMS_PER_UNIT = 0.001;
        public static final double MQUINTALS_PER_UNIT = 0.01;
        public static final double MTONS_PER_UNIT = 0.001;
        public static final double MICROGRAMS_PER_UNIT = 1000000000;
        public static final double MILLIGRAMS_PER_UNIT = 1000000;
        public static final double OUNCES_PER_UNIT = 35.27396;
        public static final double PICOGRAMS_PER_UNIT = 1000000000000000.0;
        public static final double POUNDS_PER_UNIT = 2.204623;
        public static final double SLUGS_PER_UNIT = 0.06852178;
        public static final double STICKS_PER_UNIT = 8.695652;
        public static final double STONES_PER_UNIT = 0.157473;
        public static final double TOLAS_PER_UNIT = 85.73532;
        public static final double TROYOUNCES_PER_UNIT = 32.15075;
        public static final double USQUINTALS_PER_UNIT = 0.022004623;
        public static final double USTONS_PER_UNIT = 0.001102311;

    }

}
