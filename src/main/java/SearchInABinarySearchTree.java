class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }

public class SearchInABinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode node = new TreeNode();
        if(root == null)
            return null;

        if(root.val == val)
            return root;

        if(root.val > val)
            node = searchBST(root.left, val);

        else
            node = searchBST(root.right, val);

        return node;
    }
}
