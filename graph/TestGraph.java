package diy.learnings.graph;

import java.util.Set;

public class TestGraph {

    public static void main(String args[]) {
        Graph g = Graph.createGraph();
        Set<String> dfs = g.depthFirstTraversal(g, "Alhuck");
        Set<String> bfs = g.breadthFirstTraversal(g, "Alhuck");
        
        dfs.stream().forEach(e -> System.out.println(e));
        bfs.stream().forEach(e -> System.out.println(e));
        
    }
}
