package com.microservice.Account.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity{


    @Column(name = "customer_Id")
    private Long customerId;

    @Id
    @Column(name = "accountNumber")
    private Long accountNumber;

    @Column(name = "accountType")
    private String accountType;

    @Column(name = "branchAddress")
    private String branchAddress;

}
