package techServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import domain.BlockSection;

public class BlockSectionDA {
    public BlockSectionDA()throws FileNotFoundException {
        //blockSection File
        Scanner blockSectionInfo = new Scanner(new FileReader("blockSection.csv"));// dko knows why may path sa example
        //declare the rowBlockSection
        String rowBlockSection = new String();

        //read the entire row of the file and put it in rowBlockSection
        rowBlockSection = blockSectionInfo.nextLine(); // <-- blockSection File
     
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
        StudentDA studentDA = new StudentDA();

        //attach the student list
        blockSection.setStudentList(studentDA.getStudentList());

        //display the content of Block Section object
        System.out.println(blockSection);

        blockSectionInfo.close();



    }

}