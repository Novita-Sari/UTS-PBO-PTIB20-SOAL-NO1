/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.novitasari_052_uts1;

/**
 *
 * @author Asus
 */
public class employee {
    

  //fields
    private String name;
    private int idnumber;
    private String departement;
    private String position;
    private String ps;
    private String dp;
    private int id;
    private String idNumber;
    
    //constructors
    public employee(String nm,int id,String dp,String ps)
    {
        name=nm;
        idnumber=id;
        departement=dp;
        position=ps;
    }
    public employee(String nm,String id)
    {
        name=nm;
        idNumber =id;
        departement=dp;
        position=ps;
    }
    public employee()
    {
        name="";
        idnumber=0;
        departement="";
        position="";
    }
    
    //methods
    public String getName()
    {
        return name;
    }
    public int getIdnumber()
    {
        return idnumber; 
}
    public String getDepartement()
    {
        return departement;
    }

    public String getPosition()
    {
        return position;
    }
}