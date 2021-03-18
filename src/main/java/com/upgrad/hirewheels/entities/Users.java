package com.upgrad.hirewheels.entities;


import com.upgrad.hirewheels.dao.RolesDao;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import java.util.Set;
import javax.persistence.*;
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int userId;
    @Column(length = 20,nullable = false)
    private String firstName;
    @Column(length = 20,nullable = false)
    private String lastName;
    @Column(length = 20,nullable = false)
    private String password;
    @Column(length = 20,nullable = false)
    private String email;
    @Column(length = 20,nullable = false)
    private String mobileNo;
    @Column(nullable = false)
    private int wallet_money;
  //  @ManyToOne(cascade = CascadeType.REMOVE)
  //  @JoinColumn(name = "role_id", nullable = true)
   // private Roles roleId;

    public Users( String firstName, String lastName, String password, String email, String mobileNo, int wallet_money) {
        //this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.mobileNo = mobileNo;
        this.wallet_money = wallet_money;
        //this.roleId = roleId;
    }

    public Users(String email) {
        this.email = email;
    }

    //public Users(String upgrad, String admin, String lastName, String password, String email, int i, Roles roles) {
    //}

    public Users(int i, String save_test) {

    }

    public Users() {

    }

    @OneToMany (mappedBy = "users", fetch = FetchType.EAGER)
    private Set<Users> users;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getWallet_money() {
        return wallet_money;
    }

    public void setWallet_money(int wallet_money) {
        this.wallet_money = wallet_money;
    }

   // public Roles getRoleId() {
     //   return roleId;
    //}

   // public void setRoleId(Roles roleId) {
     //   this.roleId = roleId;
    //}

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", wallet_money=" + wallet_money +
               /* ", roleId=" + roleId*/ +
                '}';



    }
}