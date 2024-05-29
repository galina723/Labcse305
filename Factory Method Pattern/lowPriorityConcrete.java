/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class lowPriorityConcrete extends requestProduct{

    
    public lowPriorityConcrete(String priority, String expireDay, String status){
        super(priority, expireDay, status);
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }
    
}
