package com.example.ramdanix.projectpertama;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ramdanix on 11/22/17.
 */

public class Siswa implements Parcelable {

    String nama;
    String kelas;



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.kelas);
    }

    public Siswa() {
    }

    protected Siswa(Parcel in) {
        this.nama = in.readString();
        this.kelas = in.readString();
    }

    public static final Creator<Siswa> CREATOR = new Creator<Siswa>() {
        @Override
        public Siswa createFromParcel(Parcel source) {
            return new Siswa(source);
        }

        @Override
        public Siswa[] newArray(int size) {
            return new Siswa[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
