import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     * sdaas.
     */
    public enum BankAccountType {
        /**
         * sad.
         */
        CHECKINGS,
        /**
         * as.
         */
        SAVINGS,
        /**
         * dd.
         */
        STUDENT,
        /**
         * wer.
         */
        WORKPLACE
    }

    /**
     * e.
     */
    private int accountNumber;
    /**
     * e2.
     * e.
     */
    public BankAccountType accountType;
    /**
     * erw.
     */
    private double accountBalance;
    /**
     * er.
     */
    private String ownerName;
    /**
     * we.
     */
    public double interestRate;
    /**
     * we.
     */
    private double interestEarned;
    /**
     * sda.
     */
    private static int numberOfAccounts;

    /**
     * df.
     *
     * @param name            qwe.
     * @param accountCategory wd.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        numberOfAccounts++;
        /*
         * Implement this function
         */
    }

    /**
     * wer.
     * @return ewr.
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * sadas.
     * @param input erge/.
     */
    public void setAccountBalance(final double input) {
        accountBalance = input;
    }

    /**
     * sds.
     * @param input sad.
     */
    public void setOwnerName(final String input) {
        ownerName = input;
    }

    /**
     * sds.
     * @return wqe.
     */
    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
