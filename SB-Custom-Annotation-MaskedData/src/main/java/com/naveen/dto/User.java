package com.naveen.dto;

import java.util.List;

import com.naveen.encrypt.MaskData;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

	private int id;
    private String name;
    @MaskData
    private String ssn;
    @MaskData
    private String phoneNumber;
    private int age;
    private String username;
    @MaskData
    private String password;
    private List<AccountDetails> accountDetails;
}