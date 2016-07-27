package com.androidpractice.demo.activity.domain;

import android.os.Parcel;
import android.os.Parcelable;

/**
 *
 * Created by zy on 2016/7/27.
 */
public class User2 implements Parcelable {

    public User2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getName());
        dest.writeInt(getAge());
    }

    public static final Creator<User2> CREATOR = new Creator<User2>() {
        @Override
        public User2 createFromParcel(Parcel source) {
            return new User2(source.readString(),source.readInt());
        }

        @Override
        public User2[] newArray(int size) {
            return new User2[size];
        }
    };
}
