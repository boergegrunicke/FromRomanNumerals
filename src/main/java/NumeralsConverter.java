import java.util.HashMap;
import java.util.Map;

/**
 * Created by Børge Grunicke on 21.02.2017.
 * <p>
 * Converter-Class for the Number-Converter
 */
public class NumeralsConverter {

    // the roman -> integer mapping
    private Map<Character, Integer> mappings = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    /**
     * converts roman number to Integer
     *
     * @param roman the roman "number"
     * @return the Integer value of the roman number
     */
    public int convertFromRomanNumerals(String roman) {
        int result = 0;
        for (int j = 0; j < roman.length(); j++)
            result = j != roman.length() - 1 &&  mappings.get(roman.charAt(j + 1)) > mappings.get(roman.charAt(j))
                    ? result - mappings.get(roman.charAt(j)) : result + mappings.get(roman.charAt(j));
        return result;
    }
}
