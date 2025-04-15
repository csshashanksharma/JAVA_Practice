import java.util.Arrays;
public class queue <T> {
    int size ;
    T[] que;
    public queue()
    {
        size = 0;
        que = (T[]) new Object[2];
    }
    public void Enqueue(T data)
    {
        if (que.length == size)
        {
            int newsize = size*2 ;
            que = Arrays.copyOf(que , newsize);
        }
        que[size] = data;
        size = size + 1;
        
    }
    public T Dequeue()
    {
        if (size == 0)
        {
            System.out.println("Queue is Empty");
            return null;
        }
        T element = que[0];
        System.arraycopy(que , 1, que , 0 , size - 1);
        que[--size] = null;
        return element ;
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

    public static void main(String[] args) {
        queue <Integer> q = new queue<>();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.display();
        q.Dequeue();
        q.display();

    }
}
