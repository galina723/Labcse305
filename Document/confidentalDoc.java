/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Document;

/**
 *
 * @author ADMIN
 */
public class confidentalDoc implements documentBuilder {

    private String Extension;
    private String Encryption;
    private Document BuilDoc;

    @Override
    public documentBuilder setExtension(String extension) {
        this.Extension = extension;
        return this;
    }

    @Override
    public documentBuilder setEncryption(String encryption) {
        this.Encryption = encryption;
        return this;
    }

    @Override
    public documentBuilder BuildDoc(Document buildDoc) {
        this.BuilDoc = buildDoc;
        return this;
    }

    @Override
    public Document build() {
        return new Document(Extension, Encryption);
    }
}
