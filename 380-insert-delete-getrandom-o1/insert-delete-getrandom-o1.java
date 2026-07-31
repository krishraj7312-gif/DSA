import java.util.*;

class RandomizedSet {
    private List<Integer> list;
    private Map<Integer, Integer> map;
    private Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        
        int indexToRemove = map.get(val);
        int lastElement = list.get(list.size() - 1);
        
        // Swap last element to the removal position
        list.set(indexToRemove, lastElement);
        map.put(lastElement, indexToRemove);
        
        // Pop last element
        list.remove(list.size() - 1);
        map.remove(val);
        
        return true;
    }
    
    public int getRandom() {
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex);
    }
}