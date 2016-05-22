package com.ssdt.util;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

import java.util.Date;

public class HTMLEntityEscapingObjectMapper extends ObjectMapper {

    public HTMLEntityEscapingObjectMapper() {
        SimpleModule module = new SimpleModule("HTML Entity Escaping Serializer", new Version(1, 0, 0, "FINAL", "com.ssdt", "ssdt-web"));
        module.addSerializer(String.class, new JSONHTMLEntityEscapingSerializer());
        module.addSerializer(Date.class, new DateSerializer());
        this.registerModule(module);
    }
}
