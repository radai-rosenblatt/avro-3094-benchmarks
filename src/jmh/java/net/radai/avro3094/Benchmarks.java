package net.radai.avro3094;

import org.apache.avro.specific.SpecificData;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class Benchmarks {

    @Benchmark
    public SpecificData vanillaAvroHappyPath(Blackhole bh) {
        return SpecificDataGetter.vanillaAvro(net.radai.avro3094.by19.SimpleRecord.class);
    }

    @Benchmark
    public SpecificData vanillaAvroSadPath(Blackhole bh) {
        return SpecificDataGetter.vanillaAvro(net.radai.avro3094.by17.SimpleRecord.class);
    }

    @Benchmark
    public SpecificData shinyHappyPath(Blackhole bh) {
        return SpecificDataGetter.newShiny(net.radai.avro3094.by19.SimpleRecord.class);
    }

    @Benchmark
    public SpecificData shinySadPath(Blackhole bh) {
        return SpecificDataGetter.newShiny(net.radai.avro3094.by17.SimpleRecord.class);
    }
}
