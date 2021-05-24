package com.example.library_system2.domain;

public class Member {

    //고유번호
    private int num;
    private String id;
    private String name;
    private String email;
    private String password;
    private String address;
    private String tel;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getTel() {
        return tel;
    }


    public void setTel(String tel) {
        this.tel = tel;
    }

    public void showInfo() {
        System.out.println("아이디:" + this.id);
        System.out.println("이름:" + this.name);
        System.out.println("이메일:" + this.email);
        System.out.println("주소:" + this.address);
        System.out.println("전화번호:" + this.tel);
        System.out.println("비밀번호:" + this.password);
    }

//    public void changePassword(String oldPassword, String newPassword) {
	/*if (!password.equals(oldPassword))
	throw new IdPasswordNotMatchingException();
	this.password = newPassword;
	}*/


}
