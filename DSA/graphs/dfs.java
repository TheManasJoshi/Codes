import java.util.*;

class DFSGraph {
    static void dfs(int node, boolean[] visited, ArrayList<Integer>[] adj) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int nei : adj[node]) {
            if (!visited[nei]) dfs(nei, visited, adj);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
            adj[v].add(u); // undirected
        }

        boolean[] visited = new boolean[n];
        dfs(0, visited, adj);
    }
}
