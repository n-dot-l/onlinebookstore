package com.bittercode.util;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import com.bittercode.model.UserRole;

public class StoreUtilTest {

    @Test
    void testIsLoggedIn() {
        HttpSession session = mock(HttpSession.class);
        
        when(session.getAttribute(UserRole.CUSTOMER.toString())).thenReturn("someuser");
        when(session.getAttribute(UserRole.SELLER.toString())).thenReturn(null);

        assertTrue(StoreUtil.isLoggedIn(UserRole.CUSTOMER, session));
        assertFalse(StoreUtil.isLoggedIn(UserRole.SELLER, session));
        
        when(session.getAttribute(UserRole.CUSTOMER.toString())).thenReturn(null);
        assertFalse(StoreUtil.isLoggedIn(UserRole.CUSTOMER, session));
    }
}