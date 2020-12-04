package de.sabartius.quarkus.auth;

import com.fasterxml.jackson.annotation.JsonCreator;

public class MyBody {

    @JsonCreator
    public MyBody(final String text) {
        this.text = text;
    }

    public String text;
}
