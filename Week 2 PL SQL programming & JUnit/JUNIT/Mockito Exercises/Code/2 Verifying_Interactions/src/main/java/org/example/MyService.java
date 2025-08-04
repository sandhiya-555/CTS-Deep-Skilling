package org.example;

public class MyService {
    public ExternalApi api;

    public MyService(ExternalApi api){
        this.api=api;
    }

    public void fetchData(){
        api.getData();
    }
}
