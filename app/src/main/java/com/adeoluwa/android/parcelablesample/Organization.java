package com.adeoluwa.android.parcelablesample;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Merlyne on 8/28/2017.
 */

public class Organization implements Parcelable {
    private int id;
    private String name;
    private byte[] logo;
    private double worth;
    private float rating;
    private long noOfEmployees;
    private String address;
    private Employee contactPerson;
    private List<Employee> employeeList;

    public Organization(int id, String name, byte[] logo, double worth, float rating, long noOfEmployees, String address, Employee contactPerson, List<Employee> employeeList) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.worth = worth;
        this.rating = rating;
        this.noOfEmployees = noOfEmployees;
        this.address = address;
        this.contactPerson = contactPerson;
        this.employeeList = employeeList;
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

    public Employee getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Employee contactPerson) {
        this.contactPerson = contactPerson;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeByteArray(this.logo);
        dest.writeDouble(this.worth);
        dest.writeFloat(this.rating);
        dest.writeLong(this.noOfEmployees);
        dest.writeString(this.address);
        dest.writeParcelable(this.contactPerson, flags);
        dest.writeTypedList(this.employeeList);
    }

    protected Organization(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.logo = in.createByteArray();
        this.worth = in.readDouble();
        this.rating = in.readFloat();
        this.noOfEmployees = in.readLong();
        this.address = in.readString();
        this.contactPerson = in.readParcelable(Employee.class.getClassLoader());
        this.employeeList = in.createTypedArrayList(Employee.CREATOR);
    }

    public static final Parcelable.Creator<Organization> CREATOR = new Parcelable.Creator<Organization>() {
        @Override
        public Organization createFromParcel(Parcel source) {
            return new Organization(source);
        }

        @Override
        public Organization[] newArray(int size) {
            return new Organization[size];
        }
    };
}
