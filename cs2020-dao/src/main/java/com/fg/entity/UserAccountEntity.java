package com.fg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userAccount")
public class UserAccountEntity {

    private long uid;
    private String account;
    private String cname;
    private String ename;
 
	public UserAccountEntity() {
  
    }
 
    public UserAccountEntity(String account, String cname, String ename) {
         this.account = account;
         this.cname = cname;
         this.ename = ename;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        public long getUid() {
        return uid;
    }
    public void setUid(long uid) {
        this.uid = uid;
    }
 
    @Column(name = "account", nullable = false)
    public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
 
    @Column(name = "cname", nullable = false)
    public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
 
    @Column(name = "ename", nullable = false)
    public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

    @Override
    public String toString() {
        return "Employee [id=" + uid + ", cname=" + cname + ", ename=" + ename + ", account=" + account + "]";
    }
 
}