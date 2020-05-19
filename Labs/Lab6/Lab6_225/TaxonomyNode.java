public class TaxonomyNode
   {
       public String Label;
       public TaxonomyNode list[];
       public static TaxonomyNode root;
       int index;
       
       public TaxonomyNode(String label, int listSize)
       {
           Label = label;
           list = new TaxonomyNode[listSize];
           index = 0;
       }
       
       public static void addChild(TaxonomyNode parent, TaxonomyNode child)
       {
           parent.list[parent.index] = child;
           parent.index++;
       }
       
       public static void setRoot(TaxonomyNode rootIn)
       {
           root = rootIn;
       }
   }