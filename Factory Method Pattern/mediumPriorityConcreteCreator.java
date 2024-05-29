/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class mediumPriorityConcreteCreator implements RequestCreator {

    @Override
    public requestProduct createRequest() {
        return new mediumPriorityRequest("Medium", "28/06/2024", "Accepted");
    }

    @Override
    public void processRequest() {
        requestProduct request = createRequest();
        request.processRequest();

    }

}
