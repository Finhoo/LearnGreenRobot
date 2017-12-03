package com.fayne.android.learngreenrobot.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by fan on 2017/12/3.
 */

@Entity
public class User {
    @Id
    private Long id;

    @Property(nameInDb = "USERNAME")
    private String username;

    @Property(nameInDb = "NICKNAME")
    private String nickname;

    @Transient
    private int tempUsageCount; // not persisted

    @Generated(hash = 523935516)
    public User(Long id, String username, String nickname) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
}
