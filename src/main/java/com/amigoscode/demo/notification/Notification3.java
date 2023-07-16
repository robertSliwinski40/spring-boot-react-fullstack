package com.amigoscode.demo.notification;

import java.util.Objects;

public class Notification3 {
    private String name;
    private String address;
    private int age;

    public Notification3(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification3 that = (Notification3) o;
        return age == that.age && name.equals(that.name) && address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, age);
    }

    @Override
    public String toString() {
        return "Notification3{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
