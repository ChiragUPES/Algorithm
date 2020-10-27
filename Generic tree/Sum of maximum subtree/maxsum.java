Algo:
/*
each node acts as a subtree.
intialize maxsubnode(msn)=0;
intialize maxsum(ms)=-infinity
child ka sum+usme(root node)ka sum.
update the value of msn and ms.
return sum.


*/
  
  static int msn=0;
 static int ms=Integer.MIN_VALUE;
  static int maxsumsbtree(Node node)
  {
      
      int sum=0;
     for(Node child:node.children)
     {
         int csum=maxsumsbtree(child);
         sum+=csum;
     }
     sum+=node.data;
     if(sum>ms)
     {
         msn=node.data;
         ms=sum;
     }
     return sum;
  }
maxsumsbtree(root);
System.out.println(msn+"@"+ms);