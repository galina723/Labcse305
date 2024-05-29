/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public abstract class requestProduct {
    public String priority;
    public String expireDay;
    public String status;

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setExpireDay(String expireDay) {
        this.expireDay = expireDay;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public requestProduct(String priority, String expireDay, String status) {
        this.priority = priority;
        this.expireDay = expireDay;
        this.status = status;
    }
    
   
    public abstract void processRequest();
    
}
