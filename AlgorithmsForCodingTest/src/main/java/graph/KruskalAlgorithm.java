package graph;

public class KruskalAlgorithm {

    private static void kruskalAlgorithm(){

    }

    private static int findParent(int[] parentList, int x) {
        if (parentList[x] != x) {
            parentList[x] = findParent(parentList, parentList[x]);
        }
        return parentList[x];
    }

    private static void unionParent(int[] parentList, int a, int b) {
        int parentA = findParent(parentList, a);
        int parentB = findParent(parentList, b);

        if (parentA < parentB) {
            parentList[parentB] = parentA;
        } else {
            parentList[parentA] = parentB;
        }
    }
}
