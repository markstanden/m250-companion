package C6_Collections.Activities.Act15;

import java.util.Random;

/**
 * Activity 15
 * Went a little off piste with this one
 * wanted to use a static builder with a private constructor
 */
public class L33tNameGenerator {
    private final String NAME;
    private final String PLACE;
    private final String LANG;

    private Random rand;

    /**
     * Want to play with a private constructor and a static builder method.
     */
    private L33tNameGenerator(int seed, String name, String place, String lang) {
        NAME = standardise(name);
        PLACE = standardise(place);
        LANG = standardise(lang);
        rand = new Random(seed);
    }

    /**
     * Static method returning a new builder
     *
     * @return a new builder for the L33tNameGenerator
     */
    public static Builder create() {
        return new Builder();
    }

    /**
     * Returns a standardised version of the supplied word
     *
     * @param word the string that should be standardised
     * @return the standardised string
     */
    private String standardise(String word) {
        return word.trim().toLowerCase();
    }


    private int rand(int number) {
        return rand.nextInt(1, 3);
    }


    public static class Builder {

        private String name = "";
        private String place = "";
        private String lang = "";
        private int seed;

        public L33tNameGenerator build() {
            return new L33tNameGenerator(seed, name, place, lang);
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPlace(String place) {
            this.place = place;
            return this;
        }

        public Builder withLang(String lang) {
            this.lang = lang;
            return this;
        }

        public Builder withSeed(int seed) {
            this.seed = seed;
            return this;
        }

    }

    /**
     * Courtesy method to test the builder only.
     * Would not form part of the public API
     *
     * @return the value of the instance constant NAME
     */
    @Deprecated
    public String getNAME() {
        return NAME;
    }

    /**
     * Courtesy method to test the builder only.
     * Would not form part of the public API
     *
     * @return the value of the instance constant PLACE
     */
    @Deprecated
    public String getPLACE() {
        return PLACE;
    }

    /**
     * Courtesy method to test the builder only.
     * Would not form part of the public API
     *
     * @return the value of the instance constant LANG
     */
    @Deprecated
    public String getLANG() {
        return LANG;
    }
}
