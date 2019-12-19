package com.hous.pojo;

public class QueryVo {
private String zuname;
private String fromdate;
private String todate;
private Integer userlistId;

private Integer userlist_id;


public Integer getUserlist_id() {
	return userlist_id;
}
public void setUserlist_id(Integer userlist_id) {
	this.userlist_id = userlist_id;
}
public Integer getUserlistId() {
	return userlistId;
}
public void setUserlistId(Integer userlistId) {
	this.userlistId = userlistId;
}
public String getZuname() {
	return zuname;
}
public void setZuname(String zuname) {
	this.zuname = zuname;
}
public String getFromdate() {
	return fromdate;
}
public void setFromdate(String fromdate) {
	this.fromdate = fromdate;
}
public String getTodate() {
	return todate;
}
public void setTodate(String todate) {
	this.todate = todate;
}
@Override
public String toString() {
	return "QueryVo [zuname=" + zuname + ", fromdate=" + fromdate + ", todate=" + todate + ", userlistId=" + userlistId
			+ ", userlist_id=" + userlist_id + "]";
}


	
}
