package com.ontact.xcv.domain.posts;

import lombok.*;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="Register")
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable=false)
    private String store;

    @Column(columnDefinition = "TEXT", nullable=false)
    private String name;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String account;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String bank;

    @Column(columnDefinition = "DOUBLE", nullable = false)
    private String latitude;

    @Column(columnDefinition = "DOUBLE", nullable = false)
    private String longitude;

    @Builder
    public Register(String store, String name, String account, String bank, String latitude, String longitude)
    {
        this.store = store;
        this.name = name;
        this.account = account;
        this.bank = bank;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void update(String store, String name, String account, String bank)
    {
        this.store = store;
        this.name = name;
        this.account = account;
        this.bank = bank;
    }
}
