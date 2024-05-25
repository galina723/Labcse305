/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author ADMIN
 */
public class ShortTerm implements contractBuilder {

    private String ContractID;
    private String PropertyID;
    private String TenantID;
    private String RentAmount;
    private Contract SignContract;

    @Override
    public contractBuilder setContractID(String ContractID) {
        this.ContractID = ContractID;
        return this;
    }

    @Override
    public contractBuilder setPropertyID(String PropertyID) {
      this.PropertyID = PropertyID;
      return this;
    }

    @Override
    public contractBuilder setTenantID(String TenantID) {
       this.TenantID = TenantID;
       return this;
    }

    @Override
    public contractBuilder setRentAmount(String RentAmount) {
       this.RentAmount = RentAmount;
       return this;
    }

    @Override
    public contractBuilder setSignContract(Contract SignContract) {
       this.SignContract = SignContract;
       return this;
    }

    @Override
    public Contract build() {
        return new Contract(ContractID, PropertyID, TenantID, RentAmount);
    }

}
