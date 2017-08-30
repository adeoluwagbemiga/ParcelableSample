package com.adeoluwa.android.parcelablesample;

import java.util.Arrays;

/**
 * Created by Merlyne on 8/28/2017.
 */

public class Organization {
    private int id;
    private String name;
    private byte[] logo;
    private double worth;
    private float rating;
    private long noOfEmployees;
    private String address;

    public Organization(int id, String name, byte[] logo, double worth, float rating, long noOfEmployees, String address) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.worth = worth;
        this.rating = rating;
        this.noOfEmployees = noOfEmployees;
        this.address = address;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public double getWorth() {
        return worth;
    }

    public void setWorth(double worth) {
        this.worth = worth;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public long getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(long noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", logo=" + Arrays.toString(logo) +
                ", worth=" + worth +
                ", rating=" + rating +
                ", noOfEmployees=" + noOfEmployees +
                ", address='" + address + '\'' +
                '}';
    }
}
