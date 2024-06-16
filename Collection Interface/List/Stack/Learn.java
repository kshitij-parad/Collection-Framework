import java.util.Stack;
public class Learn{
    public static void main(String[] args) {
        
        Stack<String>  animal = new Stack<>();

        animal.push("dog");
        animal.push("cat");
        animal.push("lion");
        animal.push("hen");

        System.out.println("Stack: "+animal);

        System.out.println(animal.peek());

        animal.pop();
        System.out.println("Stack: "+animal);
        System.out.println(animal.peek());

    }
}