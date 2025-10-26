package com.henrizz_java.part3;

import java.io.FileReader;
import java.io.IOException;

public class ConfigLoader {
    public static void main(String[] args) {

    }

    public void loadConfig(String filePath) throws ConfigLoadException {
        if (filePath == null || filePath.trim().isEmpty())
            throw new InvalidConfigPathException();
        try (var reader = new FileReader(filePath)) {
            int data;
            while ((data = reader.read()) != -1) {
                if ((char) data == '$') {
                    throw new ConfigFormatException();
                }
            }
        }
        catch (IOException e) {
            throw new ConfigLoadException(e);
        }
    }



}
