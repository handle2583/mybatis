package com.example.mybatis.page;

public class PageParam {

    private int beginLine ;
    private Integer pageSize = 3 ;
    private Integer currentPage = 0 ;

    public PageParam() {

    }


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public PageParam(int beginLine, Integer pageSize, Integer currentPage) {
        this.beginLine = beginLine;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }

    public PageParam(int beginLine) {
    }


    public int getBeginLine(){
        return pageSize*currentPage ;
    }
    @Override
    public String toString() {
        return "PageParam{" +
                "beginLine=" + beginLine +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                '}';
    }
}
