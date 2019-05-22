# Camel CI Ant Test Project

## Usage

### Prerequisites

You must have Java 8 (or higher) and Ant installed on your machine to use this project.

You can check your java version with `java --version`.

You can check if you already have Ant installed with the command: `ant -version`.

Otherwise, you can get it with those steps:

- Download an Ant 1.10.6 binary [here](https://ant.apache.org/bindownload.cgi)
- Extract it and add ant/bin to your path

### Building/Rebuilding the project

```bash
ant clean build
```

### Running Tests

```bash
ant test
```

### Running the application

```bash
ant run
```
