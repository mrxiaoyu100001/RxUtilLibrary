package com.org.rxutillibrary;

import com.vise.xsnow.http.request.PostRequest;

/**
 * @Created: xiaoyu  on 2017.12.21 15:31.
 * @Describe：
 * @Review：
 * @Modify：
 * @Version: v_1.0 on 2017.12.21 15:31.
 * @Blog:http://blog.csdn.net/noteschapter
 * @Github:https://github.com/mrxiaoyu100001
 * @Resources:
 * @Remark:
 */

public class MainRequest extends PostRequest {

    private String page;
    private String pageSize;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "MainRequest{" +
                "page='" + page + '\'' +
                ", pageSize='" + pageSize + '\'' +
                '}';
    }
}
