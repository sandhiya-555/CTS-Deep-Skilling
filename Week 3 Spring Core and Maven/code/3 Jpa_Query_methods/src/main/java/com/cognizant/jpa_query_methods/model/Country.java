package com.cognizant.jpa_query_methods.model;
import jakarta.persistence.*;
@Entity
@Table(name="country")
public class Country {
    @Id
    @Column(name = "co_code")
    private String cocode;
    @Column(name = "co_name")
    private String coname;

    public String getCo_code() {
        return cocode;
    }

    public String getCo_name() {
        return coname;
    }

    public void setCo_code(String co_code) {
        this.cocode = co_code;
    }

    public void setCo_name(String co_name) {
        this.coname = co_name;
    }
}
