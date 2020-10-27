Algo:
/*
same as find the element.
The only difference is that when we return the value we return the array list and alwys add node.data if size of return arraylist
is >0
if(res.size()>0)
{
	res.add(node.data);
	return res;
}
*/




public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    // write your code here
   if(node.data==data)
   {
       ArrayList<Integer> arr=new ArrayList<Integer>();
       arr.add(node.data);
       return arr;
   }
   for(Node child:node.children)
   {
        ArrayList<Integer> res=nodeToRootPath(child,data);
        if(res.size()>0)
        {
            res.add(node.data);
            return res;
        }
   }
   return new ArrayList<>();
}
 