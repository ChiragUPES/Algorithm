sorted array-> {12 25 37 50 62 75 87}

ek low, high par pointer.

mid -> node. 

	50 ->mid-> node
	low se mid -1 tak left(isme mid -> node, left,right)
	mid+1 se high tak right



public static Node construct(int[] arr,int lo,int hi)
    {
        if(lo>hi)
        {
            return null;
        }
        int mid=(lo+hi)/2;
        int data=arr[mid];
        Node lc=construct(arr,lo,mid-1);
        Node rc=construct(arr,mid+1,hi);
        Node node =new Node(data,lc,rc);
        return node;

    }
public static void main(String[] arg)
    {
       int[] arr={12,25,37,50,62,75,87};
       Node root=construct(arr,0,arr.length-1);
       display(root);
    }