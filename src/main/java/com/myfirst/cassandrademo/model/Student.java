package com.myfirst.cassandrademo.model;

import java.math.BigInteger;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("STUDENT")
public class Student {

	@PrimaryKey(value = "stu_id")
	private Integer stuId;

	@Column("Stu_name")
	private String name;

	@Column("stu_email")
	private String email;

	@Column("stu_phone")
	private BigInteger phone;

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigInteger getPhone() {
		return phone;
	}

	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}
}
