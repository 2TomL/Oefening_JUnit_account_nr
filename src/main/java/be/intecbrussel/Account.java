package be.intecbrussel;

public class Account {
    private String accountNr;

    public Account(String accountNr) {
        this.accountNr = accountNr;
    }

    public void setAccountNr(String accountNr) {
        this.accountNr = accountNr;
    }

    public boolean checkAccountNumberPattern() throws RuntimeException {
        String nrPattern = "\\d{3}-\\d{7}-\\d{2}";

        boolean matchesNrPattern = accountNr.matches(nrPattern);

        if (!matchesNrPattern) {
            throw new IllegalArgumentException("Invallid account nr pattern. ");
        }
        String firstTenDigits = accountNr.substring(0, 3) + accountNr.substring(4, 11);

        int lastTwoDigits = Integer.parseInt(accountNr.substring(12));

        int remainder = Integer.parseInt(firstTenDigits) % 97;

        if (remainder != lastTwoDigits) {
            throw new RuntimeException("Noo cause Anas Said also Noooo so I say NOOOOOOO as well");
        }
        return true;
    }
}