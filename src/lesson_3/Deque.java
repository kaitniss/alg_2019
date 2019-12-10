package lesson_3;

class Deque
{
    static final int MAX = 100;
    int list[];
    int right;
    int left;
    int size;

    public Deque(int size)
    {
        list = new int[MAX];
        right = -1;
        left = 0;
        this.size = size;
    }

    boolean isFull()
    {
        return ((right == 0 && left == size-1)||
                right == left +1);
    }

    // Checks whether Deque is empty or not.
    boolean isEmpty ()
    {
        return (right == -1);
    }

    // Inserts an element at front//right
    void insertRight(int key)
    {
        // check whether Deque if full or not
        if (isFull())
        {
            System.out.println("Overflow");
            return;
        }

        // If queue is initially empty
        if (right == -1)
        {
            right = 0;
            left = 0;
        }

        // front is at first position of queue
        else if (right == 0)
            right = size - 1 ;

        else // decrement front end by '1'
            right = right -1;

        // insert current element into Deque
        list[right] = key ;
    }

    // function to inset element at rear end
    // of Deque. //left
    void insertLeft(int key)
    {
        if (isFull())
        {
            System.out.println(" Overflow ");
            return;
        }

        // If queue is initially empty
        if (right == -1)
        {
            right = 0;
            left = 0;
        }

        // rear is at last position of queue
        else if (left == size-1)
            left = 0;

            // increment rear end by '1'
        else
            left = left +1;

        // insert current element into Deque
        list[left] = key ;
    }

    // Deletes element at front end of Deque
    void removeRight()
    {
        // check whether Deque is empty or not
        if (isEmpty())
        {
            System.out.println("Queue Underflow\n");
            return ;
        }

        // Deque has only one element
        if (right == left)
        {
            right = -1;
            left = -1;
        }
        else
            // back to initial position
            if (right == size -1)
                right = 0;

            else // increment front by '1' to remove current
                // front value from Deque
                right = right +1;
    }

    // Delete element at rear end of Deque
    void removeLeft()
    {
        if (isEmpty())
        {
            System.out.println(" Underflow");
            return ;
        }

        // Deque has only one element
        if (right == left)
        {
            right = -1;
            left = -1;
        }
        else if (left == 0)
            left = size-1;
        else
            left = left -1;
    }

    // Returns front element of Deque
    int getRight()
    {
        // check whether Deque is empty or not
        if (isEmpty())
        {
            System.out.println(" Underflow");
            return -1 ;
        }
        return list[right];
    }

    // function return rear element of Deque
    int getLeft()
    {
        // check whether Deque is empty or not
        if(isEmpty() || left < 0)
        {
            System.out.println(" Underflow\n");
            return -1 ;
        }
        return list[left];
    }

    // Driver program to test above function
    public static void main(String[] args)
    {

        Deque dq = new Deque(10);

        System.out.println("Insert element at left end : 5 ");
        dq.insertLeft(5);

        System.out.println("insert element at left end : 10 ");
        dq.insertLeft(10);

        System.out.println("get left element : " + dq.getLeft());

        dq.removeLeft();
        System.out.println("After delete left element new left become : " +
                dq.getLeft());

        System.out.println("inserting element at right end");
        dq.insertRight(15);

        System.out.println("get right element: " + dq.getRight());

        dq.removeRight();

        System.out.println("After delete front element new right become : " +
                +dq.getRight());
    }
}

