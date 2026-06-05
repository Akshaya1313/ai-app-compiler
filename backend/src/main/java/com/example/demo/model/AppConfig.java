package com.example.demo.model;

public class AppConfig {
    private UiSchema ui;
private ApiSchema api;
private DatabaseSchema database;
private AuthSchema auth;
private RuntimeResult runtimeResult;

    private IntentModel intent;
    private ArchitectureModel architecture;

    public IntentModel getIntent() {
        return intent;
    }

    public void setIntent(IntentModel intent) {
        this.intent = intent;
    }

    public ArchitectureModel getArchitecture() {
        return architecture;
    }

    public void setArchitecture(
        ArchitectureModel architecture
) {
    this.architecture = architecture;
}


    public UiSchema getUi() {
        return ui;
    }

    public void setUi(UiSchema ui) {
        this.ui = ui;
    }

    public ApiSchema getApi() {
        return api;
    }

    public void setApi(ApiSchema api) {
        this.api = api;
    }

    public DatabaseSchema getDatabase() {
        return database;
    }

    public void setDatabase(DatabaseSchema database) {
        this.database = database;
    }

    public AuthSchema getAuth() {
        return auth;
    }

    public void setAuth(AuthSchema auth) {
        this.auth = auth;
    }
    public RuntimeResult getRuntimeResult() {
    return runtimeResult;
}
public void setRuntimeResult(
        RuntimeResult runtimeResult
) {
    this.runtimeResult = runtimeResult;
}
}