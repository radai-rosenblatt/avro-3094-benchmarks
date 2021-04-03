#JMH benchmarks for avro-3094

this project exists dto demonstrate the issue described in avro-3094 as well as to benchmark its impact and the proposed fix.

## how to run
./gradlew jmh

## example output
on my machine

```
Benchmark                         Mode  Cnt          Score         Error  Units
Benchmarks.shinyHappyPath        thrpt    5  263429141.399 ±  561735.869  ops/s
Benchmarks.shinySadPath          thrpt    5  263153367.499 ± 1656022.472  ops/s
Benchmarks.vanillaAvroHappyPath  thrpt    5   57251120.785 ±  495866.168  ops/s
Benchmarks.vanillaAvroSadPath    thrpt    5    1132879.920 ±   20743.977  ops/s
```

which shows CacheValue beats reflection and that catching exceptions for control flow is a 50x penalty