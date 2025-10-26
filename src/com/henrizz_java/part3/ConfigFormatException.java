package com.henrizz_java.part3;

public class ConfigFormatException extends ConfigLoadException{
    public ConfigFormatException() {
        super(new ConfigFormatException());
    }
}
