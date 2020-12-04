package de.sabartius.quarkus.auth;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MyBody {

    public String text;

    @JsonCreator
    public MyBody(@JsonProperty(required = true, value = "text") final String text) {
        this.text = text;
    }
}
