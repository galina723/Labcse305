/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author ADMIN
 */
public class Contract {
   String BuildContractID;
   String BuildPropertyID;
   String BuildTenantID;
   String BuildRentAmount;
   Contract SignContract;

    public Contract(String BuildContractID, String BuildPropertyID, String BuildTenantID, String BuildRentAmount) {
        this.BuildContractID = BuildContractID;
        this.BuildPropertyID = BuildPropertyID;
        this.BuildTenantID = BuildTenantID;
        this.BuildRentAmount = BuildRentAmount;
    }
}
