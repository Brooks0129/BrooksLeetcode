package com.brooks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 李松达
 * @date: 2016/8/13.
 */
public class LC_Problem_310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 0) {
            return new ArrayList<Integer>();
        } else if (n == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(0);
            return list;
        }
        ArrayList<Integer>[] nodes = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < edges.length; i++) {
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            nodes[v1].add(v2);
            nodes[v2].add(v1);
        }
        ArrayList<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nodes[i].size() == 1) {
                leaves.add(i);
            }
        }
        int count = n;
        while (count > 2) {
            int size = leaves.size();
            count -= size;
            ArrayList<Integer> newLeaves = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Integer cur = leaves.get(i);
                for (int j = 0; j < nodes[cur].size(); j++) {
                    Integer leave = nodes[cur].get(j);
                    nodes[leave].remove(cur);
                    if (nodes[leave].size() == 1) {
                        newLeaves.add(leave);
                    }
                }
                nodes[cur].remove(i);
            }
        }
        return leaves;
    }
}
