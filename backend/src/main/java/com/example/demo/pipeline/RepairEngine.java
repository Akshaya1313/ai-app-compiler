package com.example.demo.pipeline;

import com.example.demo.model.*;

public class RepairEngine {

    public AppConfig repair(
            AppConfig config,
            ValidationResult result
    ) {

        for(String error :
                result.getErrors()) {

            if(error.equals("MISSING_UI")) {

                UiSchema ui =
                        new UiSchema();

                config.setUi(ui);
            }

            if(error.equals("MISSING_API")) {

                ApiSchema api =
                        new ApiSchema();

                config.setApi(api);
            }
        }

        return config;
    }
}