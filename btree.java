import java.io.*;
import java.util.*;

class node {
    int key;
    String name;
    node leftchild, rightchild;

    public node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String tostring() {
        return name + "has a key:" + key;
    }

}

class btree {
    node root;

    public void addnode(int key, String name) {
        node addnode = new node(key, name);

        if (root == null) {
            root = addnode;
        } else {
            node focusnode = root;
            node parent;
        }
    }

    public static void main(String args[]) {

    }
}
