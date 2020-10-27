Algo:

Initialze state zero
Check both state 0 and data bhi mil jaye.
where we get(find) the data it changes its state to 1
after that it state changes to 2


static Node predecessor;
  static Node successor;
  static int state;
  state=0;
  public static void predecessorAndSuccessor(Node node, int data) {
    // write your code here
   if(state==0)
   {
       if(node.data==data)
       {
           state=1;
           
       }else
       {
           predecessor=node;
       }
   }
   else if(state==1)
   {
       successor=node;
       state=2;
   }
   
     for(Node child:node.children)
     {
         predecessorAndSuccessor(child,data);
     }
      
      
      
      
  }

