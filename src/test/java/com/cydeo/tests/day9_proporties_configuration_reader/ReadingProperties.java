package com.cydeo.tests.day9_proporties_configuration_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    @Test
    public void reading_properties() throws IOException {

        Properties properties = new Properties();
        FileInputStream file = new FileInputStream("configuration.properties");
        properties.load(file);

        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("env"));
    }
}
