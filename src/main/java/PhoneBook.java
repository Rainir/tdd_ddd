import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, Integer> phoneBook = new HashMap<>();

    public int add(String name, int phone) {
        phoneBook.put(name, phone);
        return phoneBook.size();
    }

    public String findByNumber(int phone) {
        return null;
    }
}
