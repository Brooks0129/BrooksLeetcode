package com.brooks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/31.
 */
public class LC_Problem_133{
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
        HashMap<UndirectedGraphNode,UndirectedGraphNode> map=new HashMap<>();
        return clone(node,map);
    }
    private UndirectedGraphNode clone(UndirectedGraphNode node,HashMap<UndirectedGraphNode,UndirectedGraphNode> map){
        if(node==null){
            return null;
        }
        if(map.containsKey(node)){
            return map.get(node);
        }
        UndirectedGraphNode head=new UndirectedGraphNode(node.label);
        map.put(node,head);
        List<UndirectedGraphNode> neighbors=new ArrayList<>();
        for(UndirectedGraphNode node_neighbor : node.neighbors){
            neighbors.add(clone(node_neighbor,map));
        }
        head.neighbors=neighbors;
        return head;
    }
    class UndirectedGraphNode{
        int label;
        List<UndirectedGraphNode> neighbors;
        UndirectedGraphNode(int x){
            label=x;
            neighbors=new ArrayList<UndirectedGraphNode>();
        }
    }
}
