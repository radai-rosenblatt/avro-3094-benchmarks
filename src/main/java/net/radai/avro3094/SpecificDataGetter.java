package net.radai.avro3094;

import org.apache.avro.AvroRuntimeException;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.specific.SpecificRecordBase;

import java.lang.reflect.Field;

public class SpecificDataGetter {

    public static <T> SpecificData vanillaAvro(Class<T> c) {
        if (SpecificRecordBase.class.isAssignableFrom(c)) {
            final Field specificDataField;
            try {
                specificDataField = c.getDeclaredField("MODEL$");
                specificDataField.setAccessible(true);
                return (SpecificData) specificDataField.get(null);
            } catch (NoSuchFieldException e) {
                // Return default instance
                return SpecificData.get();
            } catch (IllegalAccessException e) {
                throw new AvroRuntimeException(e);
            }
        }
        return SpecificData.get();
    }

    private static class DataAboutClass {
        private final boolean hasModel$;
        private final SpecificData model;

        public DataAboutClass(boolean hasModel$, SpecificData model) {
            this.hasModel$ = hasModel$;
            this.model = model;
        }
    }

    private final static ClassValue<DataAboutClass> PER_CLASS_CACHE = new ClassValue<DataAboutClass>() {
        @Override
        protected DataAboutClass computeValue(Class<?> type) {
            Field specificDataField;
            try {
                specificDataField = type.getDeclaredField("MODEL$");
                specificDataField.setAccessible(true);
                return new DataAboutClass(true, (SpecificData) specificDataField.get(null));
            } catch (NoSuchFieldException e) {
                return new DataAboutClass(false, SpecificData.get());
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("envorinment too secure", e);
            }
        }
    };

    public static <T> SpecificData newShiny(Class<T> c) {
        DataAboutClass dataAboutClass = PER_CLASS_CACHE.get(c);
        return dataAboutClass.model;
    }
}
