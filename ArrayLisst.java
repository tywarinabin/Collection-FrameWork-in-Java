import java.util.ArrayList;

public class ArrayLisst {
public static void main(String[] args) {
  // Syntax of Creating ArrayList in Java
    ArrayList <Integer> al = new ArrayList<Integer>();
    // To check whether the List is empty or Not.
    Boolean checked = al.isEmpty();
    if(checked){
        System.out.println("List is Empty.");
    }
       // To Insert Element into the ArrayList
    al.add(43);
    al.add(36);
    al.add(89);
    al.add(92);
    
    // To get element of Particular index 
int valueAt0 = al.get(0);
System.out.println(valueAt0);

// To find the size of the list 
int sizeOfList = al.size();

// To set an element of Particular index we use set(2,4) function.
al.set(0,99);
System.out.println(al.size());
// To remove element from the list we use remove(index) function
al.remove(1);
System.out.println(al);
// To print element of List by using For Each Loop
for(int x : al){
  System.out.print(x +" ");
}
System.out.println();
// To Clear all element of List, We use clear() function.
al.clear();


checked = al.isEmpty();
if (checked) {
  System.out.println("List is Empty.");
}
else
  System.out.println(al);
}
}
