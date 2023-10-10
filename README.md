# code_gen_pilot / Basic Maven Example

This simple Maven project is importing JaCoCo's coverage report. For multi-module project example 
see [multi-module Maven project](../maven-multimodule/README.md)

Source: [colin-sonarsource: test-repo-java](https://github.com/colin-sonarsource/test-repo-java/tree/main)

## Usage

* Build the project, execute all the tests and analyze the project with SonarQube Scanner for Maven(from root  of the project):

```shell
        mvn clean verify sonar:sonar
```

## Documentation

[SonarScanner for Maven](https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-maven/)