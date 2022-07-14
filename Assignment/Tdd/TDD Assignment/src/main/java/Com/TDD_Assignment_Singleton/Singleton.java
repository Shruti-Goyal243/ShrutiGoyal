package Com.TDD_Assignment_Singleton;

import java.util.HashMap;
import java.util.Map;

public enum Singleton {
	  INSTANCE;

    private final Map<Character, Character> characters;

    // private constructor
    Singleton() {
        Map<Character, Character> aCharMap = new HashMap();
        aCharMap.put('a', 'e');
        aCharMap.put('o', 'u');
        // in order to keep short I erased other puts.
        characters = aCharMap;
    }

    public char getInstance(final char letter) {
        return characters.get(letter);
    }

    public boolean containsKey(char letter) {
        return characters.containsKey(letter);
    }

 }

