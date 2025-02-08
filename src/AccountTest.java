
public class AccountTest {
    private static AccountExample accountExample;

    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde", "$abc123"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isValid = accountExample.validateAccount(account);
            System.out.println("Account " + account + " is valid? " + isValid);
        }
        System.out.println();
        for (String account : invalidAccount) {
            boolean isValid = accountExample.validateAccount(account);
            System.out.println("Account " + account + " is valid? " + isValid);
        }
    }
}
