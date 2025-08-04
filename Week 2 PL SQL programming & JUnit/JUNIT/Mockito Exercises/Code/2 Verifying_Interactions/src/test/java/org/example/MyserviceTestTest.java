package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class MyserviceTestTest {

    @Test
    void test() {
        ExternalApi mockapi= Mockito.mock(ExternalApi.class);

        MyService service= new MyService(mockapi);

        service.fetchData();

        verify(mockapi).getData();
    }
}