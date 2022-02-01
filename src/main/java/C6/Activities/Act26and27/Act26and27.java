package C6.Activities.Act26and27;

import java.util.HashMap;

public class Act26and27 {
    public HashMap<Integer, String> myMap;

    public Act26and27() {
        myMap = new HashMap<>();
    }

    /**
     * The method should first check if the key given
     * by the first parameter already exists in myMap .
     * If the key does not already exist in myMap,
     * a new entry should be created with a key given by
     * the first parameter and a value given by the second parameter.
     * If the key does already exist in myMap
     * the associated value should remain unchanged.
     */
    public void populateMap(Integer key, String value) {
        myMap.putIfAbsent(key, value);
    }

    /**
     * The method first checks if the specified Integer parameter
     * is a key in the map, myMap. If it is,
     * the associated value is printed out,
     * otherwise the message "not found" is printed out.
     * @param key
     */
    public void findEntry(Integer key){
        String result = "not found";
        if(myMap.containsKey(key)){
            result = myMap.get(key);
        }
        System.out.println(result);
    }
}
