package org.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class MyServiceTestTest {
    @Test
    public void TestExternalApi(){
        ExternalApi mockapi= Mockito.mock(ExternalApi.class);
        when(mockapi.getData()).thenReturn("Mock Data");
        MyService service= new MyService(mockapi);
        String s=service.fetchData();
        assertEquals("Mock Data",s);
    }

}