/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Src.SignUp_BuilderPattern;

/**
 *
 * @author qwe98
 */
public class StoreManager extends Member{
    
    public StoreManager(int idx, String id, String pw, String name, String tel, String address, int tableSet, int takeoutSet, int openTime, int closeTime){
        this.idx = idx;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.table_set = tableSet;
        this.takeout_set = takeoutSet;
        this.open_time = openTime;
        this.close_time = closeTime;
    }

    
}
