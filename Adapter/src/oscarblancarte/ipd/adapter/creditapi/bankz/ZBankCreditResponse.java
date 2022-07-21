package oscarblancarte.ipd.adapter.creditapi.bankz;

public class ZBankCreditResponse {
    
    public boolean aproval;
    public ZBankException notAproval;

    public boolean isAproval() {
        return aproval;
    }

    public void setAproval(boolean aproval) {
        this.aproval = aproval;
    }

    public ZBankException getNotAproval() {
        return notAproval;
    }

    public void setNotAproval(ZBankException notAproval) {
        this.notAproval = notAproval;
    }
    
}