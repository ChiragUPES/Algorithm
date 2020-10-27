pre-> node, left,right
in-> left, node,right
post-> left,right,node


traversal(Node node)
{
	System.out.println(node.data+" pre order"); // pre
	traversal(node.left); //call
	System.out.println(node.data+" in order"); // in
	traversal(node.right); // call
	System.out.println(node.data+" post order"); // post
}
