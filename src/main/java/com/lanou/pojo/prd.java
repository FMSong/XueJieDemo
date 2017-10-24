package com.lanou.pojo;

public class prd {
    private int id;
    private String prd_no;
    private String prd_name;
    private String Prd_code;

    @Override
    public String toString() {
        return "prd{" +
                "id=" + id +
                ", prd_no='" + prd_no + '\'' +
                ", prd_name='" + prd_name + '\'' +
                ", Prd_code='" + Prd_code + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrd_no() {
        return prd_no;
    }

    public void setPrd_no(String prd_no) {
        this.prd_no = prd_no;
    }

    public String getPrd_name() {
        return prd_name;
    }

    public void setPrd_name(String prd_name) {
        this.prd_name = prd_name;
    }

    public String getPrd_code() {
        return Prd_code;
    }

    public void setPrd_code(String prd_code) {
        Prd_code = prd_code;
    }
}
