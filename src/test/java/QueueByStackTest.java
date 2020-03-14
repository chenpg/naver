import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueByStackTest {
    QueueByStack queueByStack=new QueueByStack();
    Stack stackone=new Stack();
    Stack stackTwo=new Stack();


    @Test
    void testQueue() {
        queueByStack.setStackone(stackone);
        queueByStack.setStacktwo(stackTwo);
        assertEquals(true, queueByStack.emmty());
        queueByStack.push(4);
        assertEquals(4,queueByStack.pop());
        queueByStack.push(6);
        queueByStack.push(8);
        queueByStack.push(9);
        assertEquals(6,queueByStack.peek());
        assertEquals(6,queueByStack.peek());
        assertEquals(false,queueByStack.emmty());
    }
}
