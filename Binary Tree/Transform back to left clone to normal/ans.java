Thoda tricky euler hai. 
Node k left k left par lgaya hai kyuki usko hi to faith mana hai


public static Node transBackFromLeftClonedTree(Node node){
    // write your code here
    if(node==null)
    {
        return null;
    }
    Node lrr=transBackFromLeftClonedTree(node.left.left); // faith kr dega 
    Node rr=transBackFromLeftClonedTree(node.right); // faith kr dega
    node.left=lrr; // attach kr diya 
    node.right=rr;
    return node;
  }
