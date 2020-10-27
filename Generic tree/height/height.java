Algo:
exception hai ki vo deepest node dega.
as per edge: initiaize ht=-1;
as per vertice : initialize ht=0;





public static int height(Node node) {

    int h=-1;
    for(Node child:node.children)
    {
        int ch=height(child);
        h=Math.max(ch,h);
    }
    return h+1;
    
  }