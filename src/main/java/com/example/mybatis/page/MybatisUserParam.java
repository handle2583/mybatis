package com.example.mybatis.page;

public class MybatisUserParam extends  PageParam{

    private String userName ;
    private String userSex ;

    public MybatisUserParam() {
        super();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public MybatisUserParam(int beginLine, Integer pageSize, Integer currentPage) {
        super(beginLine, pageSize, currentPage);
    }

    public MybatisUserParam(int beginLine) {
        super(beginLine);
    }
}
