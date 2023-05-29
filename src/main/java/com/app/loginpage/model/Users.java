package com.app.loginpage.model;

import javax.persistence.*;


@Entity
@Table(name = "login_user")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "user_id")

    private String userId;
    @Column(name = "password")

    private String password;


    public Users() {}

//    public Users(long id, String userId, String password) {
//        this.id = id;
//        this.userId = userId;
//        this.password = password;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "userId='" + userId + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
}
