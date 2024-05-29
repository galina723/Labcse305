/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class highPriorityRequest extends requestProduct{
    public highPriorityRequest(String priority, String expireDay, String status){
        super(priority, expireDay, status);
    }
    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately");
    }
    
}
