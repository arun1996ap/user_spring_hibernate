package com.britly.model;
import javax.persistence.*;
@Table(name = "users_log", catalog = "britly_db")
@Entity
public class UserAddress {


	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "log_id")
	    private Integer id;

	    private String city;

	    @Column(name = "user_id")
	    private Integer userId;

	    public Integer getUserId() {
	        return userId;
	    }

	    public void setUserId(Integer userId) {
	        this.userId = userId;
	    }

	    public UserAddress() {
	    }

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String log) {
	        this.city = log;
	    }
	}
