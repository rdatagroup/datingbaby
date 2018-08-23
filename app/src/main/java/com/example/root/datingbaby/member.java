package com.example.root.datingbaby;

public class member {

    private String Username;
    private String email;
    private String phone;
    private String location;
    private String age;
    private String like;
    private int profile_pic;

    public member(){

    }

    public member(String username, String email, String phone, String location, String age, String like, int profile_pic) {
        Username = username;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.age = age;
        this.like = like;
        this.profile_pic = profile_pic;
    }

    public String getUsername() {
        return Username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getLocation() {
        return location;
    }

    public String getAge() {
        return age;
    }

    public String getLike() {
        return like;
    }

    public int getProfile_pic() {
        return profile_pic;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public void setProfile_pic(int profile_pic) {
        this.profile_pic = profile_pic;
    }
}
