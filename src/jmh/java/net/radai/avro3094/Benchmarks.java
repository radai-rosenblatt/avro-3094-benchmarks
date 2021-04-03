package net.radai.avro3094;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class Benchmarks {

    @Benchmark
    public void vanillaAvroHappyPath(Blackhole bh) {
        bh.consume(SpecificDataGetter.vanillaAvro(net.radai.avro3094.by19.SimpleRecord.class));
    }

    @Benchmark
    public void vanillaAvroSadPath(Blackhole bh) {
        bh.consume(SpecificDataGetter.vanillaAvro(net.radai.avro3094.by17.SimpleRecord.class));
    }

    @Benchmark
    public void shinyHappyPath(Blackhole bh) {
        bh.consume(SpecificDataGetter.newShiny(net.radai.avro3094.by19.SimpleRecord.class));
    }

    @Benchmark
    public void shinySadPath(Blackhole bh) {
        bh.consume(SpecificDataGetter.newShiny(net.radai.avro3094.by17.SimpleRecord.class));
    }
}
