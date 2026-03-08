public class circularQueue {

    static class queue {
        static int size;
        static int rear = -1;
        static int front = -1;
        static int arr[];

        queue(int n) {
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("list is full");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("list is empty");
                return -1;
            }

            int result = arr[front];

            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("list is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {

        queue q = new queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        while (!queue.isEmpty()) {
            System.out.print(queue.peek()+"  ");
            queue.remove();
        }
    }
}