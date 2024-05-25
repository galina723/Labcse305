/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author ADMIN
 */
public class Client {
    public static void main(String[] args) {
        requestCreateContract();
    }
    
    public static void requestCreateContract(){
        contractBuilder contract = new Permanent();
        contract.setContractID("123");
        contract.setPropertyID("1234");
        contract.setTenantID("987");
        contract.setRentAmount("1000000");
        contract.build();
    }
}
