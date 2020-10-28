  public static int max(Node node)
    {
        if(node.right!=null)
        {
            return max(node.right);
        }else
        {
            return node.data;
        }
    }
  public static Node remove(Node node, int data) {
    // write your code here\
    if(node==null)
    {
        return null;
    }
    if(data>node.data)
    {
        node.right=remove(node.right,data);
    }
     else if(data<node.data)
    {
        node.left=remove(node.left,data);
    }
    else
    {
        if(node.left!=null && node.right!=null)
        {
            int lmax=max(node.left);
            node.data=lmax;
            node.left=remove(node.left,lmax);
            return node;
            
        }else if(node.left!=null)
        {
            return node.left;
            
        }else if(node.right!=null)
        {
            return node.right;
            
        }else
        {
            return null;
        }
    }
    return node;
  }
