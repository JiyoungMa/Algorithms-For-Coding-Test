package graph;

public class UnionFindAlgorithm {
    public static void main(String[] args) {
        int v = 6;
        int e = 4;

        int[][] connectedNodes = {
                {1, 4},
                {2, 3},
                {2, 4},
                {5, 6}
        };

        int[] parents = unionFind(v, e, connectedNodes);

        for (int i = 1; i < parents.length; i++) {
            System.out.print(findParent(parents, i) + " ");
        }
        
        System.out.println();

        for (int i = 1; i < parents.length; i++) {
            System.out.print(parents[i] + " ");
        }
    }

    private static int[] unionFind(int v, int e, int[][] connectedNodes) {
        int[] parents = new int[v + 1];

        for (int i = 1; i <= v; i++) {
            parents[i] = i;
        }

        for (int i = 0; i < connectedNodes.length; i++) {
            int a = connectedNodes[i][0];
            int b = connectedNodes[i][1];
            unionParent(parents, a, b);
        }
        return parents;
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
