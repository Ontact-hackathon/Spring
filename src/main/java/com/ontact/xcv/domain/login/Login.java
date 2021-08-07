package com.ontact.xcv.domain.login;

import lombok.*;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="Login")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable=false)
    private String userId;

    @Column(columnDefinition = "TEXT", nullable=false)
    private String userPw;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String userBank;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String userAccount;

    private int money;

    @Builder
    public Login(String userId, String userPw, String userBank, String userAccount, int money)
    {
        this.userId = userId;
        this.userPw = userPw;
        this.userBank = userBank;
        this.userAccount = userAccount;
        this.money = money;
    }

    public void update(int money) {
        this.money = money;
    }
}
