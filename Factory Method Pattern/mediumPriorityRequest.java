/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class mediumPriorityRequest extends requestProduct{
    public mediumPriorityRequest(String priority, String expireDay, String status){
        super(priority, expireDay, status);
    }
    @Override
    public void processRequest() {
        System.out.println("Request accepted, estimated completion date is 28/5/2024");
    }
    
}
