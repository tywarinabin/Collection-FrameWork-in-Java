import java.util.Stack;
public class StackColl {
    public static void main(String[] args) {
    try {
        Stack<Integer> stack = new Stack<>();
        stack.push(53);
        stack.push(84);
        stack.push(95);
        System.out.println("Top of the Stack : " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        if(stack.isEmpty()){
            System.out.println("Stack UnderFlow");
        }
        int size = stack.size();
       System.out.println("Size of Stack : "+ size);
    } catch (Exception e) {
        System.out.println("Exception type -->>> "+ e);
    }    
    }
}
