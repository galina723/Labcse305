/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Document;

/**
 *
 * @author ADMIN
 */
public interface documentBuilder {
    public documentBuilder setExtension(String extension);
    public documentBuilder setEncryption(String encryption);
    public documentBuilder BuildDoc(Document buildDoc);
    Document build();
}
