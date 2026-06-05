package com.example.demo.pipeline;

import com.example.demo.model.*;

public class RuntimeSimulator {

    public RuntimeResult simulate(
            AppConfig config
    ) {

        RuntimeResult result =
                new RuntimeResult();

        boolean executable =
                config.getDatabase() != null
                && config.getApi() != null
                && config.getUi() != null;

        result.setExecutable(
                executable
        );

        return result;
    }
}