package com.example.demo.pipeline;

import com.example.demo.model.IntentModel;

import java.util.Arrays;

public class IntentExtractor {

    public IntentModel extract(String prompt) {

        IntentModel model = new IntentModel();

        if(prompt.toLowerCase().contains("crm")) {
            model.setAppType("CRM");
        } else {
            model.setAppType("Generic App");
        }

        model.setFeatures(
                Arrays.asList(
                        "login",
                        "dashboard",
                        "contacts"
                )
        );

        model.setRoles(
                Arrays.asList(
                        "admin",
                        "user"
                )
        );

        return model;
    }
}