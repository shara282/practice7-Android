package ru.mirea.zavarzin.httpurlconnection;

public class Info {
    private String ip;
    private String country;
    private String region;
    private String city;

    public String getIp() {
        return ip;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public Info(String ip, String country, String region, String city) {
        this.ip = ip;
        this.country = country;
        this.region = region;
        this.city = city;
    }
}