package com.ssdt.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.web.util.HtmlUtils;

import java.io.IOException;

public class JSONHTMLEntityEscapingSerializer extends JsonSerializer<String> {

    public void serialize(String value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (value != null) {
            String encodedValue = HtmlUtils.htmlEscape(value);
            jsonGenerator.writeString(encodedValue);
        }
    }
}
