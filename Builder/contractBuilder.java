/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author ADMIN
 */
public interface contractBuilder {
    public contractBuilder setContractID(String ContractID);
    public contractBuilder setPropertyID(String PropertyID);
    public contractBuilder setTenantID(String TenantID);
    public contractBuilder setRentAmount(String RentAmount);
    public contractBuilder setSignContract(Contract SignContract);
    Contract build();
}
