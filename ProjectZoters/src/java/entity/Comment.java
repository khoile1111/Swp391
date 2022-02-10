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
public class Comment {
    private int comId;
    private int memId;
    private int mId;
    private String comContent;

    public Comment() {
    }

    public Comment(int comId, int memId, int mId, String comContent) {
        this.comId = comId;
        this.memId = memId;
        this.mId = mId;
        this.comContent = comContent;
    }

    public int getComId() {
        return comId;
    }

    public void setComId(int comId) {
        this.comId = comId;
    }

    public int getMemId() {
        return memId;
    }

    public void setMemId(int memId) {
        this.memId = memId;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getComContent() {
        return comContent;
    }

    public void setComContent(String comContent) {
        this.comContent = comContent;
    }

    @Override
    public String toString() {
        return "Comment{" + "comId=" + comId + ", memId=" + memId + ", mId=" + mId + ", comContent=" + comContent + '}';
    }
    
    
}
