public static void printSingleChildNodes(Node node, Node parent){
    // write your code here
    if(node==null)
    {
        return ;
    }
    if(parent!=null && parent.left==node && parent.right==null)
    {
        System.out.println(node.data);
    }
    if(parent!=null && parent.left==null && parent.right==node)
    {
        System.out.println(node.data);
    }
    printSingleChildNodes(node.left,node);
    printSingleChildNodes(node.right,node);
  }