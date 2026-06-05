# AI App Compiler

## Overview

AI App Compiler is a compiler-inspired application generation system that converts natural language requirements into structured application configurations.

The system transforms:

Natural Language → Intent → Architecture → Schemas → Validation → Repair → Runtime Check

## Architecture

User Prompt
↓
Intent Extractor
↓
System Designer
↓
Schema Generator
↓
Validator
↓
Repair Engine
↓
Runtime Simulator
↓
Final App Configuration

## Pipeline Components

### Intent Extractor

Converts natural language into structured requirements.

### System Designer

Generates application architecture including entities, pages and roles.

### Schema Generator

Produces:

* UI Schema
* API Schema
* Database Schema
* Authentication Schema

### Validator

Detects:

* Missing schemas
* Invalid configurations
* Structural inconsistencies

### Repair Engine

Repairs only failed sections instead of regenerating the entire application.

### Runtime Simulator

Checks whether the generated application configuration is executable.

## Features

* Multi-stage generation pipeline
* Structured JSON output
* Validation layer
* Automatic repair mechanism
* Runtime simulation
* Deterministic generation flow

## Tech Stack

Backend:

* Java
* Spring Boot

Frontend:

* React
* Vite
* Axios

## Evaluation Dataset

20 prompts:

* 10 real-world applications
* 10 edge cases

## Future Improvements

* LLM integration
* Dynamic schema generation
* Full code generation
* Production runtime deployment
