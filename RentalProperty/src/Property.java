/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.io.*;
import java.util.*;

public class Property {

    public Property(String Id, String Description, String OwnerId) {
        this.Id = Id;
        this.Description = Description;
        this.OwnerId = OwnerId;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }
    
    String Id;
    String Description;
    String OwnerId;
    
    public static void main(String[] args) {
        
    }
    
}
