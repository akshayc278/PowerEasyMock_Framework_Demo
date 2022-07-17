package org.akdev.allstatic.employee.product;

public class ProductInfo {
    private static String versionNumber = "17";
    private static String releaseDate = "14 Jul 2022";

    private static Version version = new Version(versionNumber,releaseDate);

    public static String getProductName(){
        return "java tutorial";
    }

    public static Version getVersion(){
        return version;
    }

    public static String getSoftwareName(){
        return "My ak software";
    }




}
