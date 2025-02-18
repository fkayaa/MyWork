package atm_project;
public class User extends Atm {
    private String userName = "Ali Can";
    private String password = "123pwd";
    private String cardNo = "123456987";
    private String iban = "TR123456789258741369852145";
    private double bakiye = 12587.1265;

    public String getCardNo() {
        return cardNo;
    }

    public String getPassword() {
        return password;
    }

    public String getIban() {
        return iban;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double yatirilan_bakiye) {
        this.bakiye += yatirilan_bakiye;
    }

    public void setBakiye1(double cekilen_bakiye) {
        this.bakiye -= cekilen_bakiye;
    }
}