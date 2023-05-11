package be.intecbrussel;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountTest {
    private Account account1;

    @BeforeEach
    void setUp(){
        account1 = new Account("967-2514532-89");//"123-4567890-12");
    }
    @Test
    public void testReturnValidAccountNumber(){
        boolean isFormatCorrect1 = account1.checkAccountNumberPattern();
        assertTrue(isFormatCorrect1, "Account number format is correct");
    }

    @Test
    public void testReturnInvalidAccountNumberFormat(){
        boolean isFormatCorrect2 = account1.checkAccountNumberPattern();
        assertFalse(isFormatCorrect2,"Account number format is incorrect");
    }
    @Test
    public void testReturnInvalidRemainder() {
        assertThrows(RuntimeException.class, () -> {
            account1.checkAccountNumberPattern();
        });
    }
}