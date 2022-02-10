/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Comment;
import entity.Member;
import helpers.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Lenovo
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Comment> displayCommentList(String mId) {
        String querry = "select * from Comment where mId = ?";
        List<Comment> list = new ArrayList<>();
        try {
            conn = DBUtils.makeConnection();
            ps = conn.prepareStatement(querry);
            ps.setString(1, mId);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Comment(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getString(4)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public void addComment(String memId, String mId, String content) {
        String querry = "insert into Comment values (?,?,?)";
        try {
            conn = DBUtils.makeConnection();
            ps = conn.prepareStatement(querry);
            ps.setString(1, memId);
            ps.setString(2, mId);
            ps.setString(3, content);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public String getNameByMemId(String memId) {
        String querry = "select nickname from Member where memId = ?";
        try {
            conn = DBUtils.makeConnection();
            ps = conn.prepareStatement(querry);
            ps.setString(1, memId);
            rs = ps.executeQuery();
            String Name = rs.getString(1);
            return Name;
        } catch (Exception e) {
        }
        return null;
    }

    public void deleteComment(String comId) {
        String querry = "delete Comment where comId = ?";
        try {
            conn = DBUtils.makeConnection();
            ps = conn.prepareStatement(querry);
            ps.setString(1, comId);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public Member displayMemberByMemId(String memID) {
        String querry = "select * from member where memId = ?";
        Member mem = new Member();
        try {
            conn = DBUtils.makeConnection();
            ps = conn.prepareStatement(querry);
            ps.setString(1, memID);
            rs = ps.executeQuery();
            while (rs.next()) {
                mem = new Member(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getInt(5), rs.getString(6));
            }
            return mem;
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Comment> list = new ArrayList<>();
        list = dao.displayCommentList("1");
        List<Member> listmem = new ArrayList<>();
        for (Comment o : list) {
            String memId = String.valueOf(o.getMemId());
            listmem.add(dao.displayMemberByMemId(memId));
        }
        Set<Member> s = new HashSet(listmem);
        for (Member cs : s) {
            System.out.println(cs);
        }
    }
}
