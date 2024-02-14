//package techServ;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import domain.BlockSectionDA {
    public BlockSectionDA()throws FileNotFoundException {
        //blockSection File
        Scanner blockSectionInfo = new Scanner (new File Reader("blockSection.csv"));// dko knows why may path sa example
        //declare the rowBlockSection
        String rowBlockSection = new String();

        //read the entire row of the file and put it in rowBlockSection
        rowBlockSection = blockSection.nextLine(); // <-- blockSection File
     
                  //forda array
        String[] rowBlockSectionList = new String [3];

        //put data in array string 
        rowBlockSectionList = rowBlockSection.split(",");

        //declare BlockSection object 
        BlockSection blockSection = new BlockSection();

        //put data in BlockSection object
        blockSection.setBlockCode(rowBlockSectionList[0].trim());
        blockSection.setDescription(rowBlockSectionList[1].trim());
        blockSection.setAdviser(rowBlockSectionList[2].trim());

        //declare StudentDA object



    }
}