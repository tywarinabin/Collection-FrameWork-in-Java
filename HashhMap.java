import java.util.HashMap;
public class HashhMap{
public static void main(String[] args) {
    // Syntax of Declaring HashMap 
    HashMap<String , Integer> hm = new HashMap<>();
 // Way of putting value in a HashMap
    hm.put("Nepal", 977);
    hm.put("India", 91);
    hm.put("UAE", 971);
    hm.put("USA", 1);
    // Way of Printing Hashmap
    System.out.println(hm);
    // To Check whether a HashMap is Empty or Not.
    if(hm.isEmpty()){
        System.out.println("HashMap is Empty");
    }
    // Getting value through Key 
    System.out.println("The Telephone Code of Nepal is  "+ hm.get("Nepal"));
     // Check the key contains in the List or Not
     if(hm.containsKey("Nepal")){
        System.out.println("Nepal is present in the HashMap");
     }
     else{
        System.out.println("Nepal is not present in the HashMap");
     }

     if(hm.containsValue(1)){
        System.out.println("1 is present");
     }
     hm.remove("India");
     System.out.println("The size of HashMap is "+ hm.size());
     hm.clear();
     Boolean b = hm.isEmpty();
     System.out.println("Empty : "+b);
}
}