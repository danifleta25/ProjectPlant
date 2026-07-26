package org.projectplant.projectplant.domain.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginServiceTest {

    private LoginService loginService;

    @BeforeEach
    void setUp() {
        loginService = new LoginService();
    }

    @Test
    void shouldLoginWithValidCredentials() {

        // Arrange
        String username = "admin";
        String password = "1234";

        // Act
        boolean result = loginService.login(username, password);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldRejectInvalidPassword() {

        // Arrange
        String username = "admin";
        String password = "incorrect";

        // Act
        boolean result = loginService.login(username, password);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldRejectInvalidUsername() {

        // Arrange
        String username = "invented";
        String password = "1234";

        // Act
        boolean result = loginService.login(username, password);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldRejectInvalidUsernameAndPassword() {

        // Arrange
        String username = "unknown";
        String password = "9999";

        // Act
        boolean result = loginService.login(username, password);

        // Assert
        assertFalse(result);
    }
}