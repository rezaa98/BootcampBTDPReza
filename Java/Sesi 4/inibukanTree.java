import java.util.Scanner;

public class inibukanTree {

    // ============main=============
    public static void main(String[] args) {
        tree tr = new tree();
        node root = new node();
        int menu = 1;
        int r = 1;
        int a;
        while (menu != 3) {
            System.out.print("1.input\n2.view\n3.Exit : ");
            menu = tr.in.nextInt();
            if (menu == 1) {
                System.out.print("Masukan Nilai Node : ");
                a = tr.in.nextInt();
                if (r == 1) {
                    root.input(a);
                    r--;
                } else
                    tr.insert(root, a);
            } else if (menu == 2)
                tr.view(root);
            else if (menu == 3)
                System.out.println("keluar");
            else
                System.out.println("Salah");
            System.out.println(" ");
        }
    }
}

// ===========Class node==================
class node {
    node left, right;
    int value;

    // ===========public void input=============
    public void input(int a) {
        value = a;
    }
}

class tree {
    static Scanner in = new Scanner(System.in);

    public void insert(node a, int b) {
        if (b < a.value) {
            if (a.left != null)
                insert(a.left, b);
            else {
                a.left = new node();
                a.left.input(b);
                System.out.println(b + " di kiri " + a.value);
            }
        } else if (b > a.value) {
            if (a.right != null)
                insert(a.right, b);
            else {
                a.right = new node();
                a.right.input(b);
                System.out.println(b + " di kanan " + a.value);
            }
        }
    }

    // ============public view============================
    public void view(node a) {
        System.out.println("Pre Order : ");
        preOrder(a);
        System.out.println(" ");

        System.out.println("in Order : ");
        inOrder(a);
        System.out.println(" ");

        System.out.println("post Order : ");
        postOrder(a);
        System.out.println(" ");
    }

    // ============Pre Order Public=====================
    public void preOrder(node a) {
        if (a != null) {
            System.out.print(a.value + " ");
            preOrder(a.left);
            preOrder(a.right);
        }
    }

    public void inOrder(node a) {
        if (a != null) {
            inOrder(a.left);
            System.out.print(a.value + " ");
            inOrder(a.right);
        }
    }

    public void postOrder(node a) {
        if (a != null) {

            postOrder(a.left);
            postOrder(a.right);
            System.out.print(a.value + " ");
        }
    }
}