/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Lenovo
 */
public class Member {
    private int memId;
    private String account;
    private String pass;
    private String nickname;
    private int rId;
    private String avatar;

    public Member() {
    }

    public Member(int memId, String account, String pass, String nickname, int rId, String avatar) {
        this.memId = memId;
        this.account = account;
        this.pass = pass;
        this.nickname = nickname;
        this.rId = rId;
        this.avatar = avatar;
    }


    public int getMemId() {
        return memId;
    }

    public void setMemId(int memId) {
        this.memId = memId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "Member{" + "memId=" + memId + ", account=" + account + ", pass=" + pass + ", nickname=" + nickname + ", rId=" + rId + ", avatar=" + avatar + '}';
    }
    
    
    
}
