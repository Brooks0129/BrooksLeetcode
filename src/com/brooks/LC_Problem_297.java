package com.brooks;
import java.util.LinkedList;
import java.util.Queue;
/**
 * @author: 李松达
 * @date: 2016/8/8.
 */
public class LC_Problem_297{
    public class Codec{
        // Encodes a tree to a single string.
        public String serialize(TreeNode root){
            if(root==null){
                return "#!";
            }
            StringBuffer sb=new StringBuffer(root.val+"!");
            sb.append(serialize(root.left));
            sb.append(serialize(root.right));
            return sb.toString();
        }
        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data){
            String[] strings=data.split("!");
            Queue<String> queue=new LinkedList<>();
            for(int i=0;i<strings.length;i++){
                queue.offer(strings[i]);
            }
            return reconPreOrder(queue);
        }
        private TreeNode reconPreOrder(Queue<String> queue){
            String value=queue.poll();
            if(value.equals("#")){
                return null;
            }
            TreeNode node=new TreeNode(Integer.valueOf(value));
            node.left=reconPreOrder(queue);
            node.right=reconPreOrder(queue);
            return node;
        }
    }
}
