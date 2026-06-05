package com.example.demo.pipeline;

import com.example.demo.model.*;

import java.util.Arrays;

public class SchemaGenerator {

    public AppConfig generate(
            IntentModel intent,
            ArchitectureModel architecture
    ) {

        AppConfig config =
                new AppConfig();

        config.setIntent(intent);
        config.setArchitecture(architecture);

        UiSchema ui = new UiSchema();
        ui.setPages(
                architecture.getPages()
        );

        ApiSchema api = new ApiSchema();
        api.setEndpoints(
                Arrays.asList(
                        "/login",
                        "/contacts",
                        "/dashboard"
                )
        );

        DatabaseSchema db =
                new DatabaseSchema();

        db.setTables(
                architecture.getEntities()
        );

        AuthSchema auth =
                new AuthSchema();

        auth.setRoles(
                intent.getRoles()
        );

        config.setUi(ui);
        config.setApi(api);
        config.setDatabase(db);
        config.setAuth(auth);

        return config;
    }
}