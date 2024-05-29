/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class highPriorityConcreteCreator implements RequestCreator{

    public requestProduct createRequest() {
        return new highPriorityRequest("Emergency", "28/05/2024", "Accept");
    }

    @Override
    public void processRequest() {
        requestProduct request = createRequest();
        request.processRequest();

    }
}
