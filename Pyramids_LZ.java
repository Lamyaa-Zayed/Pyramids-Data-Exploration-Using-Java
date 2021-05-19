/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids_lz;

//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

//import java.util.*;
//import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author icg
 */
public class Pyramids_LZ {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        
        PyramidCSCDAO pDAO = new PyramidCSCDAO();
        List<Pyramid> x = pDAO.readPyramidsFromCSV("pyramids.csv");
        for (Pyramid x1 : x) {
             System.out.println(x1.get_height());
        }
        
        System.out.println("number:"+x.size());
        System.out.println("median number:"+x.size()/2);
        System.out.println("value number:"+x.get((x.size()/2)-1).get_height());
        //System.out.println("median:"+ x.stream().limit((x.size()/2)).mapToDouble(Pyramid::get_height).toArray()[(x.size()/2)-1]);
        
        Double av = x.stream().mapToDouble(Pyramid::get_height).average().getAsDouble();
        System.out.println("Avarage:"+av);
        
        List<Double> newList=new ArrayList<Double>((x.stream().map(Pyramid::get_height).sorted().collect(toList())));
        
        System.out.println("median:"+ newList.stream().limit((x.size()/2)).toArray()[(x.size()/2)-1]);    
        
        System.out.println("first-Quartile:"+ newList.stream().limit((x.size()/4)).toArray()[(x.size()/4)-1]); 
        
        System.out.println("second-Quartile:"+ newList.stream().limit((x.size()*3/4)).toArray()[(x.size()*3/4)-1]);         
    
        //System.out.println("Quartile:"+ x.stream().sorted().limit((x.size()/4)).mapToDouble(Pyramid::get_height).toArray()[(x.size()/4)-1]);

        
    }   
}
