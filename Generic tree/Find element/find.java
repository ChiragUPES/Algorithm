Algo:
if root element itslef == data than return true.
else make a recursive loop for its children and its check whether it is returning true . if return true than return true.
else return false.

public static boolean find(Node node, int data) {
    // write your code here
    
    if(node.data==data)
    {
        return true;
    }
    for(Node child:node.children)
    {
        boolean flag=find(child,data);
        if(flag==true)
        {
            return true;
        }
    }
    return false;
}