package jlin2.examples.localtesting

import org.junit.Test
import org.junit.Assert.*

// commit
class EmailValidatorTest {

    @Test
    fun testValidEmailWithCorrectFormat() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }

    @Test
    fun testValidEmailWithSubdomain() {
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }

    @Test
    fun testInvalidEmailWithIncorrectDomain() {
        assertFalse(EmailValidator.isValidEmail("123@abc"))
    }

    @Test
    fun testInvalidEmailWithDoubleDots() {
        assertFalse(EmailValidator.isValidEmail("123@abc..com"))
    }

    @Test
    fun testInvalidEmailWithoutUsername() {
        assertFalse(EmailValidator.isValidEmail("@abc.com"))
    }

    @Test
    fun testInvalidEmailWithoutDomain() {
        assertFalse(EmailValidator.isValidEmail("testing123"))
    }

    @Test
    fun testInvalidEmailWithEmptyString() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun testInvalidEmailWithNull() {
        assertFalse(EmailValidator.isValidEmail(null))
    }
}
