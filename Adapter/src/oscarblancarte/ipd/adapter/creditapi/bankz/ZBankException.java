/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oscarblancarte.ipd.adapter.creditapi.bankz;

/**
 *
 * @author angepf
 */
public class ZBankException extends Exception {
    
    public ZBankException(){
        super("El credito no ha sido aprobado.");
    }
}
