# environ-test

The following creates an uberjar with environ configured as in the
`uberjar` profile:

```
$ lein uberjar
$ java -jar target/uberjar/environ-test-0.1.0-SNAPSHOT-standalone.jar
Uberjar test config
```

The following creates an uberjar using the environ configuration from
the `prod` profile:

```
$ lein with-profile prod uberjar
$ java -jar target/uberjar/environ-test-0.1.0-SNAPSHOT-standalone.jar
Prod test config
```
