import java.util.*;

class demo {
    Scanner in = new Scanner(System.in);
    int a[] = new int[10];
    int input, n;

    void read() {

        System.out.println("enter size:");
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
    }

    void del() {
        // int a[] = new int[10];

        for (int i = 0; i < n; i++)
            System.out.print(a[i]);
        System.out.println("enter positon to delete");
        int pos = in.nextInt();
        pos--;
        for (int i = pos; i < n; i++) {
            a[i] = a[i + 1];

        }
        n--;

    }

    void insertion() {
        System.out.println("enter the index to insert");
        int index = in.nextInt();
        index--;
        System.out.println("enter the item to be insert");
        int item = in.nextInt();
        for (int i = 0; i < n; i++)
            System.out.print(a[i]);
        System.out.print("\n");

        for (int i = n; i < index; i--) {

            a[i + 1] = a[i];

        }

        a[index] = item;
    }

    void display() {
        for (int i = 0; i < 7; i++)
            System.out.print(a[i]);
    }

}

class adel {
    public static void main(String args[]) {
        demo a = new demo();

        a.read();
        // a.insertion();

        a.del();
        a.display();
    }
}