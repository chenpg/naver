import java.util.Stack;

public class QueueByStack {

    private Stack stackone;
    private Stack stacktwo;

    public QueueByStack() {
    }


    public Object pop(){
        while (!stackone.empty()){
            this.stacktwo.push(this.stackone.pop());
        }

      return this.stacktwo.pop();
    }

    public  void push(Object object){
        this.stackone.push(object)   ;
    }

    public Object peek(){
        while (!stackone.empty()){
            this.stacktwo.push(this.stackone.pop());
        }

        return this.stacktwo.peek();
    }

    public Boolean  emmty(){
        if(this.stacktwo.empty()&&this.stackone.empty()){
            return true;
        }
        return false;
    }

    public void setStackone(Stack stackone) {
        this.stackone = stackone;
    }

    public void setStacktwo(Stack stacktwo) {
        this.stacktwo = stacktwo;
    }
}
