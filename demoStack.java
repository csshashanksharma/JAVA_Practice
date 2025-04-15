interface stackOperations
{
    void push(int data);
    int pop();
    void display();
    int peek();
}
class fixedStack implements stackOperations
{
    int[] stack ;
    int size;
    int top;
    public fixedStack(int size)
    {
        stack = new int[size];
        this.size = size;
        top = -1;
    }
    @Override
    public void push(int data)
    {
        if (top == size - 1)
        {
            System.out.println("Stack is Full cannot insert anymore Elements");
        }
        else
        {
            top = top + 1;
            stack[top] = data;
        }
    }
    @Override
    public int pop()
    {
        if (top == -1)
        {
            System.out.println("Stack is emppty");
            return -1;
        }
        int ele = stack[top];
        top = top - 1;
        return ele;
    }
    @Override
    public void display()
    {
        while (top != -1)
        {
            System.out.println(stack[top]);
            top = top - 1;
        }
    }
    @Override
    public int peek()
    {
        return stack[top];
    } 
}
class variableStack implements stackOperations
{
    int size = 0;
    int[] stack ;
    int top;
    public variableStack(int size)
    {
        stack = new int[size];
        this.size = size;
        top = -1;
    }
    @Override
    public void push(int data)
    {
        if (size - 1== top)
        {
            System.out.println("The Stack is Full so Resizeing ");
            resize();
        }
            top = top + 1;
            stack[top] = data;
    }
    @Override
    public int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is Empty Cannot pop any elements");
            return -1 ;
        }
        int ele = stack[top];
        top = top -1;
        return ele;
    }
    @Override
    public void display()
    {
        while (top != -1)
        {
            System.out.println(stack[top]);
            top = top - 1;
        }
    }
    public void resize()
    {
        int[] newStack = new int[size*2];
        System.arraycopy(stack,0,newStack,0,size);
        size = size*2;
        stack = newStack;
    }
    @Override
    public int peek()
    {
        return stack[top];
    }    
}
public class demoStack
{
    public static void main(String args[])
    {
        stackOperations fixed = new fixedStack(5);
        stackOperations variable = new variableStack(5);
        testStack(fixed );
        testStack(variable);
    }
    public static void testStack(stackOperations stack)
    {
        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);//Full in fixed and resized in Variable Stack;
        stack.display();
    }
}
