package answer;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Python");
        strings.add("Java");
        strings.add("ASP.NET");
        strings.add("Salesforce");
        strings.add("Generative AI");
        
        System.out.println("Before sorting: " + strings);
        
        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));
        
        System.out.println("After sorting: " + strings);
    }
}
