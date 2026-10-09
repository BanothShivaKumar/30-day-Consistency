import java.util.*;
public class l {
    static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void levelorder(Node root)
    {
        if(root==null)
        {
            return;
        }

        Queue<Node> a=new LinkedList<>();
        a.add(root);
        a.add(null);

        while(!a.isEmpty())
        {
            Node curr=a.remove();
            if(curr==null)
            {
                System.out.print(" ");
                if(a.isEmpty())
                {
                    break;
                }
                else
                {
                    a.add(null);
                }
            }
            else
            {
            System.out.print(curr.data+" ");
            if(curr.left!=null)
            {
                a.add(curr.left);
            }
            if(curr.right!=null)
            {
                a.add(curr.right);
            }
        }
    }
}



    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int diameter(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        int curr=height(root.left)+height(root.right)+1;
        return Math.max(curr,Math.max(ld,rd));
    }


    public static class info
    {
        int diam;
        int heig;
        public info(int diam,int heig)
        {
            this.diam=diam;
            this.heig=heig;
        }
    }
    public static info infodiamer(Node root)
    {
        if(root==null)
        {
            return new info(0,0);
        }
        info linfo=infodiamer(root.left);
        info rinfo=infodiamer(root.right);
        int diam=Math.max(Math.max(linfo.diam,rinfo.diam),linfo.heig+rinfo.heig+1);
        int height=Math.max(linfo.heig,rinfo.heig)+1;
        return new info(diam, height);

        

    }
    public static int count(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=count(root.left);
        int rh=count(root.right);
        return (lh+rh)+1;
    }
    public static int sumpofnodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=sumpofnodes(root.left);
        int rh=sumpofnodes(root.right);
        int max=(lh+rh)+root.data;
        return max;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        a.left=new Node(20);
        a.right=new Node(30);
        a.left.left=new Node(40);
        a.left.right=new Node(50);
        a.right.left=new Node(60);
        a.right.right=new Node(70);
        System.out.println("Preorder :");
        preorder(a);
        System.out.println("\ninorder :");
        inorder(a);
        System.out.println("\npostorder :");
        postorder(a);
        System.out.println();
        System.out.print("The height of the tree is:"+height(a));
        System.out.println("The total number of nodes in the tree is:"+count(a));
        System.out.println("The sum of all the nodes in the tree is:"+sumpofnodes(a));
        levelorder(a);


        System.out.print("The diameter of the tree is:");
        System.out.println(diameter(a));
        System.out.print("The diameter of the tree is info diameter:");
        System.out.println(infodiamer(a).diam);
    }
}
