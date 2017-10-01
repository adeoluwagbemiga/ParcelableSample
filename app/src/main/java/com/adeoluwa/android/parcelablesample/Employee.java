package com.adeoluwa.android.parcelablesample;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Merlyne on 9/26/2017.
 */

public class Employee implements Parcelable {
    private int id;
    private String employeeId;
    private String name;
    private  String role;

    public Employee(int id, String employeeId, String name, String role) {
        this.id = id;
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.employeeId);
        dest.writeString(this.name);
        dest.writeString(this.role);
    }

    protected Employee(Parcel in) {
        this.id = in.readInt();
        this.employeeId = in.readString();
        this.name = in.readString();
        this.role = in.readString();
    }

    public static final Parcelable.Creator<Employee> CREATOR = new Parcelable.Creator<Employee>() {
        @Override
        public Employee createFromParcel(Parcel source) {
            return new Employee(source);
        }

        @Override
        public Employee[] newArray(int size) {
            return new Employee[size];
        }
    };
}
