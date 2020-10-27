Ques: Jo 2 node ek dusre se sbse jyada duri par hai vo nikalni hai. 

comes into the category where we return something else and calculate something else.

Algo:
recursion k post order mein calculate krengyr uski diameter ki value.
isme return krengye height and calculate krengye diameter.


static  int dia=0;
  static int calculateDiaReturnHeight(Node node)
  {
      int dch=-1;
      int sdch=-1;
      for(Node child:node.children)
      {
          int ch=calculateDiaReturnHeight(child);
          if(ch>dch) // child bda hai deepest se
          {
              sdch=dch;
              dch=ch;
          }else if(ch>sdch) // child bda hai second deepest se.
          {
              sdch=ch;
          }
      }
      //Post order mein calculate dia
      if(dch+sdch+2>dia)
      {
          dia=dch+sdch+2;
      }
      dch+=1;
      return dch;
  }
  calculateDiaReturnHeight(root);
    System.out.println(dia);