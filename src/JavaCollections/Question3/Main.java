package JavaCollections.Question3;
/* Q3. Design a Data Structure SpecialStack that supports all the stack operations
like push(), pop(), isEmpty(), isFull() and an additional operation getMin()
which should return a minimum element from the SpecialStack.
(Expected complexity O(1))
*/

import java.util.Stack;

class SpecialStack extends Stack<Integer> {
    // This is a monotonic stack that
    // will contain the minimum element on top
    // and will getMin() in O(1) Time complexity
    Stack<Integer> minStack;
    int size;


    SpecialStack(int sz){
        size=sz;
        minStack=new Stack<>();
    }

    @Override
    public synchronized boolean isEmpty() {
        if(size<1)
            return true;
        return super.isEmpty();
    }

    public boolean isFull(){
        return this.size()==size;
    }

    @Override
    public Integer push(Integer item) {

            if(this.isFull()){
                System.out.println("Stack Overflow!");
                return null;
            }
            System.out.println(item+ " is pushed into stack");
            if(minStack.isEmpty() || item.compareTo(minStack.peek())<0)
                minStack.push(item);

            return super.push(item);
    }

    @Override
    public Integer pop(){
        if(this.isEmpty()){
            System.out.println("Stack Underflow!");
            return null;
        }
        System.out.println(this.peek()+ " is popped from stack");
        if(minStack.peek().compareTo(this.peek())==0){
            minStack.pop();
        }
        return super.pop();
    }

    int getMin(){
       return minStack.peek();
    }
}
public class Main {

    public static void main(String[] args) {
        SpecialStack specialStack= new SpecialStack(4);
        specialStack.push(4);
        specialStack.pop();
        specialStack.pop(); // Under Flow
        specialStack.push(10);
        specialStack.push(20); specialStack.push(30);
        specialStack.push(40);
        specialStack.push(4); // OverFlow
        specialStack.push(50); // OverFlow

        System.out.println("The Stack min is: "+ specialStack.getMin());


    }

}
