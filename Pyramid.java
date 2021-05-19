/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids_lz;

/**
 *
 * @author icg
 */
public class Pyramid {
    private double height;
    private String modern_name;
    private String pharoh;
    private String site;
    
    public Pyramid(double height, String modern_name, String pharoh, String site){
        this.height = height;
        this.modern_name = modern_name;
        this.pharoh = pharoh;
        this.site = site;
    }
    public void set_pharoh(String pharoh){
        this.pharoh = pharoh;
    }
    public void set_site(String site){
        this.site = site;
    }
    public void set_modern_name(String modern_name){
        this.modern_name = modern_name;
    }
    public void set_height(double height){
        this.height = height;
    }
    public String get_pharoh(){
        return this.pharoh;
    }
    public String get_site(){
        return this.site;
    }
    public String get_modern_name(){
        return this.modern_name;
    }
    public double get_height(){
        return this.height;
    }
}
