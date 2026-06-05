package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.pipeline.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class GenerateController {

    @PostMapping("/generate")
    public AppConfig generate(
            @RequestBody PromptRequest request
    ) {

        IntentExtractor extractor =
                new IntentExtractor();

        IntentModel intent =
                extractor.extract(
                        request.getPrompt()
                );

        SystemDesigner designer =
                new SystemDesigner();

        ArchitectureModel architecture =
                designer.design(
                        intent.getAppType()
                );

        SchemaGenerator generator =
                new SchemaGenerator();

        AppConfig config =
                generator.generate(
                        intent,
                        architecture
                );

        Validator validator =
                new Validator();

        ValidationResult result =
                validator.validate(config);

        if (!result.isValid()) {

            RepairEngine repairEngine =
                    new RepairEngine();

            config =
                    repairEngine.repair(
                            config,
                            result
                    );
        }
        RuntimeSimulator simulator =
        new RuntimeSimulator();

RuntimeResult runtimeResult =
        simulator.simulate(config);

config.setRuntimeResult(
        runtimeResult
);

        return config;
    }
}