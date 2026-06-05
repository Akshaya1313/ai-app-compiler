package com.example.demo.pipeline;

import com.example.demo.model.ArchitectureModel;

import java.util.Arrays;

public class SystemDesigner {

    public ArchitectureModel design(String appType){

        ArchitectureModel model =
                new ArchitectureModel();

        if(appType.equals("CRM")){

            model.setEntities(
                    Arrays.asList(
                            "User",
                            "Contact",
                            "Subscription"
                    )
            );

            model.setPages(
                    Arrays.asList(
                            "Login",
                            "Dashboard",
                            "Contacts"
                    )
            );
        }

        return model;
    }
}