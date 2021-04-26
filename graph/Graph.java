package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graph {

    public class Vertex {

        String label;

        public Vertex(String label) {
            this.label = label;
        }
    }

    private Map<Vertex, List<Vertex>> adjVertices;
    
    Graph () {
        this.adjVertices = new HashMap<Vertex, List<Vertex>>();
    }

    void addVertex(String label) {

        Vertex v1 = new Vertex(label);
        adjVertices.putIfAbsent(v1, new ArrayList<>());
    }

    void addEdges(String a, String b) {

        Vertex v1 = new Vertex(a);
        Vertex v2 = new Vertex(b);

        adjVertices.get(v1)
            .add(v2);
        adjVertices.get(v2)
            .add(v1);
    }

    void removeVertex(String label) {

        Vertex v1 = new Vertex(label);
        adjVertices.values()
            .stream()
            .forEach(e -> e.remove(v1));
        adjVertices.remove(v1);
    }

    void removeEdges(String a, String b) {

        Vertex v1 = new Vertex(a);
        Vertex v2 = new Vertex(b);

        if (adjVertices.get(v1) != null) {
            adjVertices.get(v1)
                .remove(v2);
        }

        if (adjVertices.get(v2) != null) {
            adjVertices.get(v2)
                .remove(v1);

        }
    }

    public List<Vertex> getAdjListVertices(Vertex v) {
        return adjVertices.get(v);
    }

    public Set<String> depthFirstTraversal(Graph g, String root) {

        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            String v = stack.pop();
            if (!visited.contains(v)) {
                visited.add(v);
                for (Vertex adjE : g.getAdjListVertices(new Vertex(v))) {
                    stack.push(adjE.label);
                }
            }
        }

        return visited;
    }

    public Set<String> breadthFirstTraversal(Graph g, String root) {

        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            String v = queue.poll();
            for (Vertex adjEdge : g.getAdjListVertices(new Vertex(v))) {

                if (!visited.contains(adjEdge.label)) {

                    visited.add(adjEdge.label);
                    queue.add(adjEdge.label);
                }
            }
        }

        return visited;

    }

    public static Graph createGraph() {

        Graph g = new Graph();

        g.addVertex("Alhuck");
        g.addVertex("Elon");
        g.addVertex("Dan");

        g.addEdges("Alhuck", "Elon");
        g.addEdges("Alhuck", "Dan");
        g.addEdges("Elon", "Dan");

        return g;
    }
}
