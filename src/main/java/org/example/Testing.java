package org.example;

public class Testing {

    public static String format(String name ){

        if (name.equals("hello"))
            return name;
        return formatString(name);
    }

    private static String formatString(String name) {
        return "Formatted" + name;
    }
}
