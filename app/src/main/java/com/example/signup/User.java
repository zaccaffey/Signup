package com.example.signup;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * pojo/ VO/ model
 */
public class User implements Parcelable {
    String email;
    String password;
    int index;

    public User(String email, String password, int index) {
        this.email = email;
        this.password = password;
        this.index = index;
    }

    protected User(Parcel in) {
        email = in.readString();
        password = in.readString();
        index = in.readInt();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    parcel.writeString(email);
    parcel.writeString(password);
    parcel.writeInt(index);
    }
}
