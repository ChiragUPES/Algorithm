agr k level ka bola hai to k-1 ,k-1 left or right k liye.
if(k<0 || node==null)
{
	return;
}


//code

public static void printKLevelsDown(Node node, int k){
    // write your code here
    if(k<0 || node==null)
    {
        return;
    }
    if(k==0)
    {
        System.out.println(node.data);
    }
    printKLevelsDown(node.left,k-1);
    printKLevelsDown(node.right,k-1);
    
  }