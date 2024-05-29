/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class lowPriorityConcreteCreator implements RequestCreator {

    @Override
    public requestProduct createRequest() {
        return new lowPriorityConcrete("Ignore", "28/05/2024", "Done");
    }

    @Override
    public void processRequest() {
        requestProduct request = createRequest();
        request.processRequest();

    }

}
