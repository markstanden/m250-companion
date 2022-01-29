package C6.Activities.Act15;

import java.util.Random;

public class FantasyNameGenerator {
    private final String NAME;
    private final String PLACE;
    private final String ANIMAL;

    /**
     * Want to play with private constructors and builder methods.
     */
    private FantasyNameGenerator(String name, String place, String animal){
        NAME = name;
        PLACE = place;
        ANIMAL = animal;
    }

    public static Builder create(){
        return new Builder();
    }

    public String getName() {
        return NAME;
    }

    public static class Builder {
        private String name = "Brian";
        private String place = "Bristol";
        private String animal = "Badger";

        public FantasyNameGenerator build(){
            return new FantasyNameGenerator(name, place, animal);
        }

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withPlace(String place){
            this.place = place;
            return this;
        }

        public Builder withAnimal(String animal){
            this.animal = animal;
            return this;
        }
    }
}
