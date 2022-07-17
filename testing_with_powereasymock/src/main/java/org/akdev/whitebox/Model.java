package org.akdev.whitebox;

public class Model {

    private static int noOfObjects = 0;

    private String name = "";
    private String version = "";

    public Model() {
        this("sample App", "1.0");
    }

    public Model(String name) {
        this(name, "1.0");
    }

    public Model(String name, String version) {
        noOfObjects++;
        this.name = name;
        this.version = version;
    }
}
