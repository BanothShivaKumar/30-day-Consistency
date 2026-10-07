// public class t
// {
//     static class Node
//     {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data)
//         {
//             this.data=data;
//             this.left=null;
//             this.right=null;
//         }
//     }

//     public static void preorder(Node root)
//     {
//         if(root==null)
//         {
//             return;
//         }
//         System.out.print(root.data+" ");
//         preorder(root.left);
//         preorder(root.right);
//     }
//     public static void inorder(Node root)
//     {
//         if(root==null)
//         {
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data+" ");
//         inorder(root.right);
//     }
//     public static void postorder(Node root)
//     {
//         if(root==null)
//         {
//             return;
//         }
//         postorder(root.left);
//         postorder(root.right);
//         System.out.print(root.data+" ");
//     }

//     public static int height(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         int lh=height(root.left);
//         int rh=height(root.right);
//         return Math.max(lh,rh)+1;
//     }
//     public static int count(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         int lh=count(root.left);
//         int rh=count(root.right);
//         return (lh+rh)+1;
//     }
//     public static int sumpofnodes(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         int lh=sumpofnodes(root.left);
//         int rh=sumpofnodes(root.right);
//         return (lh+rh)+root.data;
//     }
//     public static void main(String[] args) {
//         Node a=new Node(10);
//         a.left=new Node(20);
//         a.right=new Node(30);
//         a.left.left=new Node(40);
//         a.left.right=new Node(50);
//         a.right.left=new Node(60);
//         a.right.right=new Node(70);
//         System.out.println("Preorder :");
//         preorder(a);
//         System.out.println("\ninorder :");
//         inorder(a);
//         System.out.println("\npostorder :");
//         postorder(a);
//         System.out.println();
//         System.out.print("The height of the tree is:"+height(a));
//         System.out.println("The total number of nodes in the tree is:"+count(a));
//         System.out.println("The sum of all the nodes in the tree is:"+sumpofnodes(a));
//     }
// }


public class t
{
    static class Node{
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
    public static boolean isidentical(Node r1,Node r2)
    {
        if(r1==null && r2==null)
        {
            return true;
        }
        if(r1==null || r2==null || r1.data!=r2.data)
        {
            return false;
        }
        if(!isidentical(r1.left, r2.left))
        {
            return false;
        }
        if(!isidentical(r1.right, r2.right))
        {
            return false;
        }
    return true;
    }
    public static boolean checkissbutree(Node a1,Node a2)
    {
        if(a1==null)
        {
            return false;
        }
        if(a1.data==a2.data)
        {
            if(isidentical(a1,a2))
            {
                return true;
            }
        }
        return checkissbutree(a1.left, a2) || checkissbutree(a1.right, a2);
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        a.left=new Node(2);
        a.right=new Node(3);
        a.left.left=new Node(4);
        a.left.right=new Node(5);
        a.right.left=new Node(6);
        a.right.right=new Node(7);
        Node subtree=new Node(2);
        subtree.left=new Node(4);
        subtree.right=new Node(5);
        System.out.print(checkissbutree(a,subtree));
    }
}