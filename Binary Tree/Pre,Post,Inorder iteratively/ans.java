Logic:
Pair class mein state ka funda use krengye jissey pta lgega konsa order chl rha hai

state1-> pre order mein print kro state bdao or left mein jao
state2-> in order mein print kro state bdao or right mein jao
state3 -> post order mein print kro or pop.



public static void iterativePrePostInTraversal(Node node) {
    // write your code here
   Stack<Pair> st=new Stack<>();
   Pair rp=new Pair(node,1);
   st.push(rp);
   String pre="";
   String in="";
   String post="";
   while(st.size()>0)
   {
       Pair top=st.peek();
       if(top.state==1)
       {
           pre+=top.node.data+" ";
           top.state++;
           if(top.node.left!=null)
           {
               Pair lp=new Pair(top.node.left,1);
               st.push(lp);
           }
           
       }
       else if(top.state==2)
       {
            in+=top.node.data+" ";
           top.state++;
           if(top.node.right!=null)
           {
               Pair lp=new Pair(top.node.right,1);
               st.push(lp);
           }
           
       }
       else
       {
           post+=top.node.data+" ";
           st.pop();
           
       }
   }
   System.out.println(pre);
   System.out.println(in);
   System.out.println(post);
  }
