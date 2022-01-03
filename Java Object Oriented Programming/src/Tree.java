import java.awt.*;

public class Tree {
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;

    //Creating a static attribute
    static Color TRUNK_COLOR = new Color(102,51,0);

    // constructor
    Tree(double heightFt, double trunkDiameterInches, TreeType treeType){
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }
    //Our behavior is represented by a function
    void grow(){
        this.heightFt = this.heightFt +10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    static void announceTree(){
        System.out.println("Look out for that " + TRUNK_COLOR + "tree!");
    }

    void announceTallTree(){
        if(this.heightFt > 100){
            System.out.println("That's a tall " + this.treeType + " tree!");
        }
    }
}
