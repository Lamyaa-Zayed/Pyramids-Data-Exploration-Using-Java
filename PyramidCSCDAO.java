/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids_lz;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author icg
 */
public class PyramidCSCDAO {
    private List<Pyramid> Pyramids = new ArrayList<Pyramid>();
    
    public List<Pyramid> readPyramidsFromCSV(String filepath) {
        try{
            List<String> a = new ArrayList<String>();
            Scanner SC = new Scanner (new File(filepath));
            int i = 0;
            while(SC.hasNextLine()){
                a.add(SC.nextLine());
                if(i >= 1){
                   String[] row = a.get(i).split(",");
                   if(!row[0].isEmpty() && !row[2].isEmpty() && !row[4].isEmpty() && !row[7].isEmpty()){
                       Pyramids.add(new Pyramid(Double.parseDouble(row[7]), row[2], row[0], row[4]));
                     //System.out.println(",[i]:"+i+",[7]:"+Double.parseDouble(row[7]));
                      // Pyramids.add(new Pyramid(Double.parseDouble("2.6"),  row[2], row[4], row[7]));
                   }
                }
                i++;
            }
            SC.close();
        }
        catch(Exception e){
            System.out.println("Error happen!");
            System.out.println(e);
            e.printStackTrace();
        }
        return Pyramids;
    }    
}
