/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Document;

/**
 *
 * @author ADMIN
 */
public class Client {
    public static void main(String[] args) {
        
    }
    public static void newDocument(){
        documentBuilder normal = new normalDoc();
        normal.setEncryption("none");
        normal.setExtension("txt");
        normal.build();
        documentBuilder confi = new confidentalDoc();
        confi.setEncryption("aes").setEncryption("zip");
        confi.build();
    }
}
