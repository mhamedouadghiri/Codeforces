package SetC;

import java.util.LinkedList;
import java.util.Scanner;

public class C982_CutEmAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 1) {
            System.out.println(-1);
            System.exit(0);
        }
        Graph tree = new Graph(n);
        for (int i = 0; i < n - 1; i++) tree.addEdge(scanner.nextInt() - 1, scanner.nextInt() - 1);
        tree.dfs(0, -1);
        System.out.println(tree.c);
    }
}

class Graph {
    private int V;
    int c;
    private LinkedList<Integer>[] adj;

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    int dfs(int node, int parent) {
        int child = 1;
        for (int u : adj[node]) {
            if (u != parent) {
                int sub = dfs(u, node);
                if (sub % 2 == 0) c++;
                child += sub;
            }
        }
        return child;
    }
}
