package com.mirolyubov.parsers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Converter {

    private final static String baseFile = "user.json";

    public static void toJSON(List<CategoryType> items) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseFile), items);

        System.out.println("json created!");
    }

    public static List<CategoryType> toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(baseFile), new TypeReference<List<CategoryType>>(){});
    }
}
