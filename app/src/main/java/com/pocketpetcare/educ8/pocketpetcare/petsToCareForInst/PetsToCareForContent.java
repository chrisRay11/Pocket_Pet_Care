package com.pocketpetcare.educ8.pocketpetcare.petsToCareForInst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class PetsToCareForContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<PetsToCareForInst> ITEMS = new ArrayList<PetsToCareForInst>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, PetsToCareForInst> ITEM_MAP = new HashMap<String, PetsToCareForInst>();

    static {

        addItem(new PetsToCareForInst("1", "Amphibians")); //frogs, toad, newts, salamanders
        addItem(new PetsToCareForInst("2", "Arachnids")); //spiders, scorpions
        addItem(new PetsToCareForInst("3", "Bird")); //birds
        addItem(new PetsToCareForInst("4", "Cats")); //cats
        addItem(new PetsToCareForInst("5", "Dogs")); //dogs
        addItem(new PetsToCareForInst("6", "Fish (Cold Water)")); //fish regular
        addItem(new PetsToCareForInst("7", "Fish (Salt Water)")); //fish tropical
        addItem(new PetsToCareForInst("8", "Guinea Pigs")); //guinea pigs
        addItem(new PetsToCareForInst("9", "Rabbits")); //rabbits
        addItem(new PetsToCareForInst("10", "Reptiles")); //snakes, lizards, crocodiles, turtles
        addItem(new PetsToCareForInst("11", "Small Pets")); //mice, hamsters, rats, gerbils
        addItem(new PetsToCareForInst("12", "Other"));


    }

    private static void addItem(PetsToCareForInst item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);

    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class PetsToCareForInst {

        public String Hatter;
        public String id;
        public String content;
// = "Hello I am a/an" + id
        public PetsToCareForInst(String id, String content) {
            this.id = id;
            this.content = content;
            this.Hatter = "hi hatter";
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
