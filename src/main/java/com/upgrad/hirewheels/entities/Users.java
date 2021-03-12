package com.upgrad.hirewheels.entities;


import javax.persistence.*;
@Entity
public class Users {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column()
    private int user_id ;
    @Column()
    private  String  first_name;
    @Column()
    private String last_name;
    @Column()
    private String  password;
    @Column()
    private String email;
    @Column()
    private String mobile_no;
    @Column()
    private double wallet_money;
   @ManyToOne
    private Roles role_id;

    public Users(int user_id, String first_name, String last_name, String password, String email, String mobile_no, double wallet_money, Roles role_id) {
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.email = email;
        this.mobile_no = mobile_no;
        this.wallet_money = wallet_money;
        this.role_id = role_id;
    }

    public Users() {

    }

    public static String getFirst_name() {
        return null;
    }

    public void setUser_id(int user_id) {
       this.user_id = user_id;
   }

    public  String getFirst_name(String first_name) {
        return first_name ;
    }

    public  void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public double getWallet_money() {
        return wallet_money;
    }

    public void setWallet_money(double wallet_money) {
        this.wallet_money = wallet_money;
    }

    public Roles getRole_id() {
        return role_id;
    }

    public void setRole_id(Roles role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "Users{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile_no='" + mobile_no + '\'' +
                ", wallet_money=" + wallet_money +
                ", role_id=" + role_id +
                '}';
    }

    public void setRole_id(int i) {
    }
}


