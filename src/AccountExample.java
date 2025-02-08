
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExample() {
    }

    public boolean validateAccount(String account) {
        return Pattern.matches(ACCOUNT_REGEX, account);
    }
}
