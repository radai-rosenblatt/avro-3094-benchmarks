package net.radai.avro3094;

import org.apache.avro.specific.SpecificData;
import org.junit.Assert;
import org.junit.Test;

public class SpecificDataGetterTest {

    @Test
    public void testOldCodegen() throws Exception {
        SpecificData usingVanilla = SpecificDataGetter.vanillaAvro(net.radai.avro3094.by17.SimpleRecord.class);
        SpecificData usingNewShiny = SpecificDataGetter.newShiny(net.radai.avro3094.by17.SimpleRecord.class);
        Assert.assertSame(SpecificData.get(), usingVanilla);
        Assert.assertSame(usingVanilla, usingNewShiny);
    }

    @Test
    public void testNewCodegen() throws Exception {
        SpecificData usingVanilla = SpecificDataGetter.vanillaAvro(net.radai.avro3094.by19.SimpleRecord.class);
        SpecificData usingNewShiny = SpecificDataGetter.newShiny(net.radai.avro3094.by19.SimpleRecord.class);
        Assert.assertNotSame(SpecificData.get(), usingVanilla); //newer classes have a "dedicated" MODEL$
        Assert.assertSame(usingVanilla, usingNewShiny);
    }
}
