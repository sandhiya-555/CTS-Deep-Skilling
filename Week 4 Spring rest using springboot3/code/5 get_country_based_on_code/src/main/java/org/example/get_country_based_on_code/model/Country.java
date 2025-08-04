package org.example.get_country_based_on_code.model;

import java.util.ArrayList;
import java.util.List;

public class Country{
    private String name;
    private String code;

    public Country(String name, String code) {
        this.name = name;
        this.code = code;
    }
    private static final List<Country> list= new ArrayList<>();

    public static List<Country> getList(){
        if(list.isEmpty()){
            list.add(new Country("India","IN"));
            list.add(new Country("NewZealand","NZ"));
            list.add(new Country("England","ENG"));
            list.add(new Country("Australia","AUS"));
        }
        return list;
    }

    public static Country getCountry(String code){
        for(Country c:getList()){
            if(c.getCode().equalsIgnoreCase(code)){
                return c;
            }
        }
        return null;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}