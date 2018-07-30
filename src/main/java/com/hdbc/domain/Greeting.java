package com.hdbc.domain;

/**
 * @Description:
 * @author:Young
 * @version:
 * @Project: Bootdemo
 * @Package: com.hdbc.domain
 * @Date date: 2018/7/30
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
