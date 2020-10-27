height mein
if in terms of edges-> -1
if in terms of node-> 0

public static int height(Node node) {
    // write your code here
    if(node==null)
    {
        return -1;
    }
   int lh=height(node.left);
   int rh=height(node.right);
   return Math.max(lh,rh)+1;
  }


public static int max(Node node) {
    // write your code here
   if(node==null)
   {
        return Integer.MIN_VALUE;
   }
    int ls=max(node.left);
    int rs=max(node.right);
    return Math.max(node.data,Math.max(ls,rs));
    
    
  }

 public static int sum(Node node) {
    // write your code here
    if(node==null)
    {
        return 0;
    }
    
    int ls=sum(node.left);
    int rs=sum(node.right);
    return ls+rs+node.data;
    
  }

public static int size(Node node) {
    // write your code here
    if(node==null)
    {
        return 0;
    }
   int ls=size(node.left);
   int rs=size(node.right);
   return ls+rs+1;
  }
