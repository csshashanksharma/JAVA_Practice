import java.util.Arrays;
public class Gqueue <T> 
{
    T[] que;
    int size;
    public Gqueue()
    {
        size = 0;
        que = (T[]) new Object[2];   
    }
    public void Enqueue(T element)
    {
        if (que.length == size)
        {
            int newSize = size*2;
            que = Arrays.copyOf(que , newSize);
        }
        que[size] = element;
        size = size + 1;
    }
    public T dequeue()
    {
        if (size == 0)
        {
            System.out.println("The Queue is Empty to insert");
            return null;
        }
        else
        {
            T delElement = que[0];
            System.arraycopy(que, 1, que, 0, size -1);
            que[--size] = null;
            return delElement;
        }
    }
    public void display()
    {
        System.out.println("Queue elements are ;");
        for(T element : que)
        {
            if (element != null)
            {
                System.out.println(element);
            }

        }
    }
    public static void main(String args[])
    {
        Gqueue<Integer> queue = new Gqueue<>();

        queue.Enqueue(10);
        queue.Enqueue(30);
        queue.Enqueue(50);
        queue.Enqueue(70);
        queue.Enqueue(40);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}

