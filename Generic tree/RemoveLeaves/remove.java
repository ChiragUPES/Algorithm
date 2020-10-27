
			10
	
	20		30		40
    				
  50  60 70   	     80 90 100	      110 120 130

Algo:
/*
faith ki agr 20 ko call krein to vo apne leaves hta dega.
same 30 kr dega than same 40 
uske baad ham 10 k leaves hta dengye

Points to be rembered:
1) if we apply loop 
for(Node child: node.children)
{
	if(child.children.size()==0)
	{
		node.children.remove(child);
	}
}
Error dega concurentModification .. mtlb jis par loop chla rhe hai usi par change kr rhe hai.
So, apply
for(int i=0;i<node.children.size();i++)
{
}

2) arrayList mein loop ulta chlta hai removal k time par.
3) Pre order mein removal

*/

public static void removeLeaves(Node node) {
    // write your code here
    for(int i=node.children.size()-1;i>=0;i--)
    {
        Node child=node.children.get(i);
        if(child.children.size()==0)
        {
            node.children.remove(child);
        }
    }
   
   for(Node child:node.children)
   {
       removeLeaves(child);
   }
}


	