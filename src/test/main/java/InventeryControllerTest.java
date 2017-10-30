package test.main.java;

import main.java.InventeryController;

import main.java.SqliteConnector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class InventeryControllerTest extends Mockito {
    @Test
    public void testServlet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getParameter("id")).thenReturn("1");
        when(request.getParameter("itemName")).thenReturn("chair");
        when(request.getParameter("units")).thenReturn("5");
        new InventeryController().doPost(request, response);
        assertEquals(null, response.getContentType());

    }
    @Test(expected = NullPointerException.class)
    public final void testDoPostPositive() throws ServletException, IOException {
        new InventeryController().doPost(null, null);
    }
}


