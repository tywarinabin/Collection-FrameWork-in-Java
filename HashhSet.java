import java.util.HashSet;
import java.util.Iterator;
 



public class HashhSet {
  

  public static void Defination(){
    System.out.println("Hash Set is a collection framework which implements set Interface and hash table for storage. ");
    System.out.println("HashSet is used to store Unordered set i.e elements are arranged randomly");
    System.out.println("Duplication of Data are not allowed in HashSet.");
  }
  public static void main(String[] args) {
    Defination();
    HashSet<Integer> hashSet1 = new HashSet<>();

    // Adding in HashSet
    hashSet1.add(5);
    hashSet1.add(3);
    hashSet1.add(9);
    hashSet1.add(5);            // No duplication are allowed in Hashset
    System.out.println(hashSet1);
    HashSet<Integer> hashSet2 = new HashSet<>();
    hashSet2.add(2);
    hashSet2.add(3);
    hashSet2.add(4);
    hashSet2.add(5);

    // hashSet2.retainAll(hashSet1) function simply adding the common 
    // elements which are on both set 1 and 2 in hashSet 2
    hashSet2.retainAll(hashSet1);
    System.out.print("Intersection of HashSet1 and  HashSet 2 are : ");
    System.out.println(hashSet2);

    // Finding Difference of two HashSet 
    hashSet1.removeAll(hashSet2);
  // It removes all the elements from hashSet1 which are same as HashSet2 


  
    // Search in HashSet

    if (hashSet1.contains(6)) {
      System.out.println("Number 6 Contains in HashSet....!");
    }
    if (hashSet1.contains(6)) {
      System.out.println("6 is not Contained .....!");
    }


    // Adding all elements of Another HashSet1 from HashSet2 
    hashSet1.addAll(hashSet2);


    // Delete in HashSet
    hashSet1.remove(5);
    if (!hashSet1.contains(5)) {
      System.out.println("5 is Deleted Sucessfully ...");
    }

    // Size of HashSet

    Integer x = hashSet1.size();
    int y = x.intValue();  // Unboxing i.e COnverting 
    System.out.println("The size of HashSet is : " + y);

    // Iterator in HashSet

    Iterator it = hashSet1.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}