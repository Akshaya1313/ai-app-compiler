package com.example.demo.pipeline;

import com.example.demo.model.*;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    public ValidationResult validate(AppConfig config) {

        List<String> errors =
                new ArrayList<>();

        if(config.getIntent() == null) {
            errors.add("MISSING_INTENT");
        }

        if(config.getArchitecture() == null) {
            errors.add("MISSING_ARCHITECTURE");
        }

        if(config.getUi() == null) {
            errors.add("MISSING_UI");
        }

        if(config.getApi() == null) {
            errors.add("MISSING_API");
        }

        if(config.getDatabase() == null) {
            errors.add("MISSING_DATABASE");
        }

        ValidationResult result =
                new ValidationResult();

        result.setValid(errors.isEmpty());
        result.setErrors(errors);

        return result;
    }
}