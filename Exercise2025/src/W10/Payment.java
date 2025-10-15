/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W10;

/**
 *
 * @author pensyarah
 */
public class Payment {
    public double amountInCash;
    public String chequeNum;
    public String name;
    public String expiryDate;
    public String type;
    public int code;

    public Payment(double amountInCash) {
        this.amountInCash = amountInCash;
    }

    public Payment(double amountInCash, String chequeNum) {
        this.amountInCash = amountInCash;
        this.chequeNum = chequeNum;
    }

    public Payment(double amountInCash, String name, String type,String expiryDate, int code) {
        this.amountInCash = amountInCash;
        this.name = name;
        this.type = type;
        this.expiryDate = expiryDate;
        this.code = code;
    }
    
    
    
}
