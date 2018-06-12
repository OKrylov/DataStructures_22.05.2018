public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");//0
        graph.addVertex("B");//1
        graph.addVertex("C");//2
        graph.addVertex("D");//3
        graph.addVertex("E");//4
        graph.addVertex("F");//5
        graph.addVertex("G");//6

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");

        graph.addEdge("B", "E");
        graph.addEdge("D", "F");
        graph.addEdge("F", "G");

        System.out.println("DFS:");
        graph.dfs("A");

        System.out.println("");
        System.out.println("---------------");

        System.out.println("BFS");
        graph.bfs("A");




    }
}
