Algo:
use queue.
remove
print
add children 


public static void levelOrder(Node node) {
    // write your code here
    // remove print add children
    Queue<Node> mq=new ArrayDeque<>();
    mq.add(node);
    while(mq.size()>0)
    {
        int count =mq.size();
        for(int i=0;i<count;i++)
        {
            node=mq.remove();
            System.out.print(node.data+" ");
            if(node.left!=null)
            {
                mq.add(node.left);
            }
            if(node.right!=null)
            {
                mq.add(node.right);
            }
        }
        System.out.println();
    }
    
  }