package com.fg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "Users")
public class UsersEntity {
 
    @Id
    @Column(name = "id")
    Integer Id;
    
    @Column(name = "code")
    String code;
    
    @Column(name = "useracc")
    String useracc;
    
    @Column(name = "userpsw")
    String userpsw;
 
    @Column(name = "name")
    String name;
 
    @Column(name = "age")
    Integer age;
 
    @Column(name = "address")
    String address;
    
    @Column(name = "phone")
    String phone;
    
    @Column(name = "addacc")
    String addacc;
    
    @Column(name = "adddate")
    String adddate;
    
    @Column(name = "modacc")
    String modacc;
    
    @Column(name = "moddate")
    String moddate;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUseracc() {
		return useracc;
	}

	public void setUseracc(String useracc) {
		this.useracc = useracc;
	}

	public String getUserpsw() {
		return userpsw;
	}

	public void setUserpsw(String userpsw) {
		this.userpsw = userpsw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddacc() {
		return addacc;
	}

	public void setAddacc(String addacc) {
		this.addacc = addacc;
	}

	public String getAdddate() {
		return adddate;
	}

	public void setAdddate(String adddate) {
		this.adddate = adddate;
	}

	public String getModacc() {
		return modacc;
	}

	public void setModacc(String modacc) {
		this.modacc = modacc;
	}

	public String getModdate() {
		return moddate;
	}

	public void setModdate(String moddate) {
		this.moddate = moddate;
	}
    
}