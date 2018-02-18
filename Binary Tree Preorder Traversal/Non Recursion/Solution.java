/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        if(root==null){
            return result;
        }
        
        stack.push(root);
        while(!stack.empty()){
            TreeNode node = stack.pop();
        if(node!=null){
            result.add(node.val);
            stack.push(node.right);
            stack.push(node.left);
        }
        }
        
        return result;
        
    }
}

