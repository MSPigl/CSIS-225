/**
 * Write a description of class Taxonomy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taxonomy
{
    public static void printSpecies(TaxonomyNode curr, int index)
    {
        if (curr.list == null || curr.list.length == 0)
        {
            System.out.println(curr.Label);
            if (index == curr.list.length)
            {
                printSpecies(curr, index + 1);
            }
            else
            {
                //curr = TaxonomyNode.root;
                //printSpecies(curr, index + 1);
            }
        }
        //curr = curr.list[index];
        if (index != curr.list.length)
        {
            printSpecies(curr.list[index], index);
        }
        //curr = TaxonomyNode.root;
        
        printSpecies(TaxonomyNode.root, index + 1);
    }

    public static void main(String[] args)
    {
        TaxonomyNode root = new TaxonomyNode("root", 2); 
        
        TaxonomyNode phylum1 = new TaxonomyNode("phylum1", 2);
        TaxonomyNode phylum2 = new TaxonomyNode("phylum2", 2);
        TaxonomyNode.addChild(root, phylum1);
        TaxonomyNode.addChild(root, phylum2);
        
        TaxonomyNode phylum1_class1 = new TaxonomyNode("phylum1_class1", 2);
        TaxonomyNode phylum1_class2 = new TaxonomyNode("phylum1_class2", 2);
        TaxonomyNode.addChild(phylum1, phylum1_class1);
        TaxonomyNode.addChild(phylum1, phylum1_class2);
        
        TaxonomyNode phylum2_class1 = new TaxonomyNode("phylum2_class1", 2);
        TaxonomyNode phylum2_class2 = new TaxonomyNode("phylum2_class2", 2);
        TaxonomyNode.addChild(phylum2, phylum2_class1);
        TaxonomyNode.addChild(phylum2, phylum2_class2);
        
        TaxonomyNode phylum1_class1_order1 = new TaxonomyNode("phylum1_class1_order1", 2);
        TaxonomyNode phylum1_class1_order2 = new TaxonomyNode("phylum1_class1_order2", 2);
        TaxonomyNode.addChild(phylum1_class1, phylum1_class1_order1);
        TaxonomyNode.addChild(phylum1_class1, phylum1_class1_order2);
        
        TaxonomyNode phylum2_class1_order1 = new TaxonomyNode("phylum2_class1_order1", 2);
        TaxonomyNode phylum2_class1_order2 = new TaxonomyNode("phylum2_class1_order2", 2);
        TaxonomyNode.addChild(phylum2_class1, phylum2_class1_order1);
        TaxonomyNode.addChild(phylum2_class1, phylum2_class1_order2);
        
        TaxonomyNode phylum1_class2_order1 = new TaxonomyNode("phylum1_class2_order1", 2);
        TaxonomyNode phylum1_class2_order2 = new TaxonomyNode("phylum1_class2_order2", 2);
        TaxonomyNode.addChild(phylum1_class2, phylum1_class2_order1);
        TaxonomyNode.addChild(phylum1_class2, phylum1_class2_order2);
        
        TaxonomyNode phylum2_class2_order1 = new TaxonomyNode("phylum2_class2_order1", 2);
        TaxonomyNode phylum2_class2_order2 = new TaxonomyNode("phylum2_class2_order2", 2);
        TaxonomyNode.addChild(phylum2_class2, phylum2_class2_order1);
        TaxonomyNode.addChild(phylum2_class2, phylum2_class2_order2);
        
        TaxonomyNode phylum1_class1_order1_family1 = new TaxonomyNode("phylum1_class1_order1_family1", 2);
        TaxonomyNode phylum1_class1_order1_family2 = new TaxonomyNode("phylum1_class1_order1_family2", 2);
        TaxonomyNode.addChild(phylum1_class1_order1, phylum1_class1_order1_family1);
        TaxonomyNode.addChild(phylum1_class1_order1, phylum1_class1_order1_family2);
        
        TaxonomyNode phylum2_class1_order1_family1 = new TaxonomyNode("phylum2_class1_order1_family1", 2);
        TaxonomyNode phylum2_class1_order1_family2 = new TaxonomyNode("phylum2_class1_order1_family2", 2);
        TaxonomyNode.addChild(phylum2_class1_order1, phylum2_class1_order1_family1);
        TaxonomyNode.addChild(phylum2_class1_order1, phylum2_class1_order1_family2);
        
        TaxonomyNode phylum1_class1_order2_family1 = new TaxonomyNode("phylum1_class1_order2_family1", 2);
        TaxonomyNode phylum1_class1_order2_family2 = new TaxonomyNode("phylum1_class1_order2_family2", 2);
        TaxonomyNode.addChild(phylum1_class1_order2, phylum1_class1_order2_family1);
        TaxonomyNode.addChild(phylum1_class1_order2, phylum1_class1_order2_family2);
        
        TaxonomyNode phylum2_class1_order2_family1 = new TaxonomyNode("phylum2_class1_order2_family1", 2);
        TaxonomyNode phylum2_class1_order2_family2 = new TaxonomyNode("phylum2_class1_order2_family2", 2);
        TaxonomyNode.addChild(phylum2_class1_order2, phylum2_class1_order2_family1);
        TaxonomyNode.addChild(phylum2_class1_order2, phylum2_class1_order2_family2);
        
        TaxonomyNode phylum1_class2_order1_family1 = new TaxonomyNode("phylum1_class2_order1_family1", 2);
        TaxonomyNode phylum1_class2_order1_family2 = new TaxonomyNode("phylum1_class2_order1_family2", 2);
        TaxonomyNode.addChild(phylum1_class2_order1, phylum1_class2_order1_family1);
        TaxonomyNode.addChild(phylum1_class2_order1, phylum1_class2_order1_family2);
        
        TaxonomyNode phylum2_class2_order1_family1 = new TaxonomyNode("phylum2_class2_order1_family1", 2);
        TaxonomyNode phylum2_class2_order1_family2 = new TaxonomyNode("phylum2_class2_order1_family2", 2);
        TaxonomyNode.addChild(phylum2_class2_order1, phylum2_class2_order1_family1);
        TaxonomyNode.addChild(phylum2_class2_order1, phylum2_class2_order1_family2);
        
        TaxonomyNode phylum1_class2_order2_family1 = new TaxonomyNode("phylum1_class2_order2_family1", 2);
        TaxonomyNode phylum1_class2_order2_family2 = new TaxonomyNode("phylum1_class2_order2_family2", 2);
        TaxonomyNode.addChild(phylum1_class2_order2, phylum1_class2_order2_family1);
        TaxonomyNode.addChild(phylum1_class2_order2, phylum1_class2_order2_family2);
        
        TaxonomyNode phylum2_class2_order2_family1 = new TaxonomyNode("phylum2_class2_order2_family1", 2);
        TaxonomyNode phylum2_class2_order2_family2 = new TaxonomyNode("phylum2_class2_order2_family2", 2);
        TaxonomyNode.addChild(phylum2_class2_order2, phylum2_class2_order2_family1);
        TaxonomyNode.addChild(phylum2_class2_order2, phylum2_class2_order2_family2);
        
        TaxonomyNode phylum1_class1_order1_family1_genus1 = new TaxonomyNode("phylum1_class1_order1_family1_genus1", 0);
        TaxonomyNode phylum1_class1_order1_family1_genus2 = new TaxonomyNode("phylum1_class1_order1_family1_genus2", 0);
        TaxonomyNode.addChild(phylum1_class1_order1_family1, phylum1_class1_order1_family1_genus1);
        TaxonomyNode.addChild(phylum1_class1_order1_family1, phylum1_class1_order1_family1_genus2);
        
        TaxonomyNode phylum2_class1_order1_family1_genus1 = new TaxonomyNode("phylum2_class1_order1_family1_genus1", 0);
        TaxonomyNode phylum2_class1_order1_family1_genus2 = new TaxonomyNode("phylum2_class1_order1_family1_genus2", 0);
        TaxonomyNode.addChild(phylum2_class1_order1_family1, phylum2_class1_order1_family1_genus1);
        TaxonomyNode.addChild(phylum2_class1_order1_family1, phylum2_class1_order1_family1_genus2);
        
        TaxonomyNode phylum1_class1_order1_family2_genus1 = new TaxonomyNode("phylum1_class1_order1_family2_genus1", 0);
        TaxonomyNode phylum1_class1_order1_family2_genus2 = new TaxonomyNode("phylum1_class1_order1_family2_genus2", 0);
        TaxonomyNode.addChild(phylum1_class1_order1_family2, phylum1_class1_order1_family2_genus1);
        TaxonomyNode.addChild(phylum1_class1_order1_family2, phylum1_class1_order1_family2_genus2);
        
        TaxonomyNode phylum2_class1_order1_family2_genus1 = new TaxonomyNode("phylum1_class1_order1_family2_genus1", 0);
        TaxonomyNode phylum2_class1_order1_family2_genus2 = new TaxonomyNode("phylum1_class1_order1_family2_genus2", 0);
        TaxonomyNode.addChild(phylum2_class1_order1_family2, phylum2_class1_order1_family2_genus1);
        TaxonomyNode.addChild(phylum2_class1_order1_family2, phylum2_class1_order1_family2_genus2);
        
        TaxonomyNode phylum1_class1_order2_family1_genus1 = new TaxonomyNode("phylum1_class1_order2_family1_genus1", 0);
        TaxonomyNode phylum1_class1_order2_family1_genus2 = new TaxonomyNode("phylum1_class1_order2_family1_genus2", 0);
        TaxonomyNode.addChild(phylum1_class1_order2_family1, phylum1_class1_order2_family1_genus1);
        TaxonomyNode.addChild(phylum1_class1_order2_family1, phylum1_class1_order2_family1_genus2);
        
        TaxonomyNode phylum2_class1_order2_family1_genus1 = new TaxonomyNode("phylum1_class1_order2_family1_genus1", 0);
        TaxonomyNode phylum2_class1_order2_family1_genus2 = new TaxonomyNode("phylum1_class1_order2_family1_genus2", 0);
        TaxonomyNode.addChild(phylum2_class1_order2_family1, phylum2_class1_order2_family1_genus1);
        TaxonomyNode.addChild(phylum2_class1_order2_family1, phylum2_class1_order2_family1_genus2);
        
        TaxonomyNode phylum1_class1_order2_family2_genus1 = new TaxonomyNode("phylum1_class1_order2_family2_genus1", 0);
        TaxonomyNode phylum1_class1_order2_family2_genus2 = new TaxonomyNode("phylum1_class1_order2_family2_genus2", 0);
        TaxonomyNode.addChild(phylum1_class1_order2_family2, phylum1_class1_order2_family2_genus1);
        TaxonomyNode.addChild(phylum1_class1_order2_family2, phylum1_class1_order2_family2_genus2);
        
        TaxonomyNode phylum2_class1_order2_family2_genus1 = new TaxonomyNode("phylum2_class1_order2_family2_genus1", 0);
        TaxonomyNode phylum2_class1_order2_family2_genus2 = new TaxonomyNode("phylum2_class1_order2_family2_genus2", 0);
        TaxonomyNode.addChild(phylum2_class1_order2_family2, phylum2_class1_order2_family2_genus1);
        TaxonomyNode.addChild(phylum2_class1_order2_family2, phylum2_class1_order2_family2_genus2);
        
        TaxonomyNode phylum1_class2_order1_family1_genus1 = new TaxonomyNode("phylum1_class2_order1_family1_genus1", 0);
        TaxonomyNode phylum1_class2_order1_family1_genus2 = new TaxonomyNode("phylum1_class2_order1_family1_genus2", 0);
        TaxonomyNode.addChild(phylum1_class2_order1_family1, phylum1_class2_order1_family1_genus1);
        TaxonomyNode.addChild(phylum1_class2_order1_family1, phylum1_class2_order1_family1_genus2);
        
        TaxonomyNode phylum2_class2_order1_family1_genus1 = new TaxonomyNode("phylum2_class2_order1_family1_genus1", 0);
        TaxonomyNode phylum2_class2_order1_family1_genus2 = new TaxonomyNode("phylum2_class2_order1_family1_genus2", 0);
        TaxonomyNode.addChild(phylum2_class2_order1_family1, phylum2_class2_order1_family1_genus1);
        TaxonomyNode.addChild(phylum2_class2_order1_family1, phylum2_class2_order1_family1_genus2);
        
        TaxonomyNode phylum1_class2_order1_family2_genus1 = new TaxonomyNode("phylum1_class2_order1_family2_genus1", 0);
        TaxonomyNode phylum1_class2_order1_family2_genus2 = new TaxonomyNode("phylum1_class2_order1_family2_genus2", 0);
        TaxonomyNode.addChild(phylum1_class2_order1_family2, phylum1_class2_order1_family2_genus1);
        TaxonomyNode.addChild(phylum1_class2_order1_family2, phylum1_class2_order1_family2_genus2);
        
        TaxonomyNode phylum2_class2_order1_family2_genus1 = new TaxonomyNode("phylum2_class2_order1_family2_genus1", 0);
        TaxonomyNode phylum2_class2_order1_family2_genus2 = new TaxonomyNode("phylum2_class2_order1_family2_genus2", 0);
        TaxonomyNode.addChild(phylum2_class2_order1_family2, phylum2_class2_order1_family2_genus1);
        TaxonomyNode.addChild(phylum2_class2_order1_family2, phylum2_class2_order1_family2_genus2);
        
        TaxonomyNode phylum1_class2_order2_family1_genus1 = new TaxonomyNode("phylum1_class2_order2_family1_genus1", 0);
        TaxonomyNode phylum1_class2_order2_family1_genus2 = new TaxonomyNode("phylum1_class2_order2_family1_genus2", 0);
        TaxonomyNode.addChild(phylum1_class2_order2_family1, phylum1_class2_order2_family1_genus1);
        TaxonomyNode.addChild(phylum1_class2_order2_family1, phylum1_class2_order2_family1_genus2);
        
        TaxonomyNode phylum2_class2_order2_family2_genus1 = new TaxonomyNode("phylum2_class2_order2_family2_genus1", 0);
        TaxonomyNode phylum2_class2_order2_family2_genus2 = new TaxonomyNode("phylum2_class2_order2_family2_genus2", 0);
        TaxonomyNode.addChild(phylum2_class2_order2_family2, phylum2_class2_order2_family2_genus1);
        TaxonomyNode.addChild(phylum2_class2_order2_family2, phylum2_class2_order2_family2_genus2);
        
        TaxonomyNode.setRoot(root);
        
        printSpecies(root, 0);
    }
}