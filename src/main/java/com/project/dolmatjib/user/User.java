package com.project.dolmatjib.user;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String accountName;
    @Column
    private String userName;
    @Column
    private String idolGroup;
    @Column
    private String firstMember;
    @Column
    private String secondMember;
    @Column
    private String email;
    @Column
    private String mobileNumber;
    @Column
    private String accountStatus;
    @Column
    private String createDate;
    @Column
    private String updateDate;
    @Column
    private Long creatorId;
    @Column
    private Long updaterId;
}
