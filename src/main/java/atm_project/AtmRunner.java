package atm_project;

public class AtmRunner {
    public static void main(String[] args) {
        User user = new User();
        Atm atm = new Atm();
        atm.login(user);
    }
}