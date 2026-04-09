class GraphMatrix {

    private int vertices;
    private int matrix[][];

    GraphMatrix(int v) {
        vertices = v;
        matrix = new int[v][v];
    }

    // Add Edge
    void addEdge(int source, int destination) {
        matrix[source][destination] = 1;

        // For undirected graph
        matrix[destination][source] = 1;
    }

    // Print Graph
    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        GraphMatrix g = new GraphMatrix(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        g.printGraph();
    }
}