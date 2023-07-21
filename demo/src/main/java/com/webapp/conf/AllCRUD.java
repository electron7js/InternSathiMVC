/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.conf;

import com.webapp.model.DataModel;
import com.webapp.model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bijesh
 */
public class AllCRUD {

  ////////
    ///////Login Sheet Methods
    //////
    public static boolean loginMethod(UserModel user) {
        try {
            String username=user.getUsername();
            String password=user.getPassword();
            int x = 0;
            String serverUsername;
            String serverPassword;
            Connection con = ConnectDB.connect();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM login ");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               serverUsername = rs.getString("Username");
                serverPassword = rs.getString("Password");
                if (username.equalsIgnoreCase(serverUsername) && password.equals(serverPassword)) {
                    x = 1;
                }
            }
            if (x == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            
            return false;
        }

    }

    public static boolean registerMethod(UserModel user) {
        try {
            String username=user.getUsername();
            String password=user.getPassword();
            Connection con = ConnectDB.connect();
            PreparedStatement ps = con.prepareStatement("INSERT INTO login  (Username,Password) VALUES(?,?)");
           ps.setString(1,username);
           ps.setString(2, password);
           ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AllCRUD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    
    ////////
    ////////Data Methods
    ////////
    public static ArrayList<DataModel> getData() {
        ArrayList<DataModel> allDataModels = new ArrayList<>();
        try {
            Connection con = ConnectDB.connect();
            String sql = "SELECT * FROM data";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DataModel data=new DataModel();
                data.setId(rs.getInt("ID"));
                data.setTitle(rs.getString("Title"));
                data.setContent(rs.getString("Content"));
                data.setAuthor(rs.getString("Author"));
                data.setImage(rs.getString("Image"));
                data.setCreated_on(rs.getString("Created_on"));
                allDataModels.add(data);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AllCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allDataModels;
    }
      public static ArrayList<UserModel> getAllUsers() {
        ArrayList<UserModel> allusers = new ArrayList<>();
        try {
            Connection con = ConnectDB.connect();
            String sql = "SELECT * FROM login";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                UserModel user=new UserModel();
                user.setId(rs.getInt("ID"));
                user.setUsername(rs.getString("Username"));
                user.setCreated_on(rs.getString("Created-on"));
                allusers.add(user);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AllCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allusers;
    }
        public static ArrayList<UserModel> getUser(int id) {
        ArrayList<UserModel> allusers = new ArrayList<>();
        try {
            Connection con = ConnectDB.connect();
            String sql = "SELECT * FROM login WHERE ID=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                UserModel user=new UserModel();
                user.setId(rs.getInt("ID"));
                user.setUsername(rs.getString("Username"));
                user.setCreated_on(rs.getString("Created-on"));
                allusers.add(user);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AllCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allusers;
    }
     public static void deleteData(int id) {
        try {
           Connection con = ConnectDB.connect();
            PreparedStatement ps = con.prepareStatement("DELETE FROM data WHERE ID=?");
           ps.setInt(1,id);
           ps.executeUpdate();
          
        } catch (SQLException ex) {
            Logger.getLogger(AllCRUD.class.getName()).log(Level.SEVERE, null, ex);
           
        }
    }
     public static boolean addData(DataModel data) {
        try {
            String title=data.getTitle();
            String content=data.getContent();
            String author=data.getAuthor();
            String image=data.getImage();
                                                           
            Connection con = ConnectDB.connect();
            PreparedStatement ps = con.prepareStatement("INSERT INTO data  (Title,Content,Author,Image) VALUES(?,?,?,?)");
           ps.setString(1,title);
           ps.setString(2,content);
           ps.setString(3,author);
           ps.setString(4,image);
           ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AllCRUD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
       public static boolean updateData(DataModel data) {
        try {
            String title=data.getTitle();
            String content=data.getContent();
            String author=data.getAuthor();
            String image=data.getImage();
            String created_on=data.getCreated_on();
            int id=data.getId();
            
                                                           
            Connection con = ConnectDB.connect();
            PreparedStatement ps = con.prepareStatement("UPDATE data SET Title=?,Content=?,Author=?,Image=?,Created_on=? WHERE id=? ");
           ps.setInt(6, id);
            ps.setString(1,title);
           ps.setString(2,content);
           ps.setString(3,author);
           ps.setString(4,image);
           ps.setString(5,created_on);
           ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AllCRUD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
       public static boolean deleteUser(int ID) {
        try {
            Connection con = ConnectDB.connect();
            PreparedStatement ps = con.prepareStatement("DELETE FROM login WHERE ID=?");
            ps.setInt(1, ID);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AllCRUD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
            public static boolean updateUser(UserModel user) {
        try {
           int id=user.getId();
           String username=user.getUsername();
           String password=user.getPassword();
            
                                                           
            Connection con = ConnectDB.connect();
            PreparedStatement ps = con.prepareStatement("UPDATE login SET Username=?,Password=? WHERE ID=?");
          ps.setString(1,username);
          ps.setString(2, password);
          ps.setInt(3, id);
           ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AllCRUD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
}
}