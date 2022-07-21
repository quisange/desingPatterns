package oscarblancarte.ipd.adapter.creditapi.bankz;

public class ZBankCreditAPI {
    
    public ZBankCreditResponse sendCreditRequest(ZBankCreditRequest request) throws ZBankException{
        ZBankCreditResponse response = new ZBankCreditResponse();
        
        if(request.getRequestAmount()<= 5000){
            response.setAproval(true);
        }else{
            ZBankException e = new ZBankException();
            response.setNotAproval(e);
            throw e;
        }
        return response;
    }
}