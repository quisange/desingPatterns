package oscarblancarte.ipd.adapter.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import oscarblancarte.ipd.adapter.creditapi.bankz.ZBankCreditAPI;
import oscarblancarte.ipd.adapter.creditapi.bankz.ZBankCreditRequest;
import oscarblancarte.ipd.adapter.creditapi.bankz.ZBankCreditResponse;
import oscarblancarte.ipd.adapter.creditapi.bankz.ZBankException;

public class ZBankCreditAdapter implements IBankAdapter{

    @Override
    public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
        BankCreditResponse response = new BankCreditResponse();
        
        try {
            ZBankCreditRequest zrequest = new ZBankCreditRequest();
            zrequest.setCustomerName(request.getCustomer());
            zrequest.setRequestAmount(request.getAmount());
            
            ZBankCreditAPI api = new ZBankCreditAPI();
            ZBankCreditResponse zresponse = api.sendCreditRequest(zrequest);
            
            response.setApproved(zresponse.isAproval());
        } catch (ZBankException ex) {
            Logger.getLogger(ZBankCreditAdapter.class.getName()).log(Level.WARNING, "Error en otorgamiento de credito", ex);
        }
        return response;
    }
}