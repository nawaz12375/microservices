package com.microservice.Account.mappers;

import com.microservice.Account.dto.AccountDto;
import com.microservice.Account.entity.Accounts;

public class AccountsMapper {

    public static AccountDto mapsToAccountsDto(Accounts accounts, AccountDto accountDto) {
      accountDto.setAccountNumber(accounts.getAccountNumber());
      accountDto.setAccountType(accounts.getAccountType());
      accountDto.setBranchAddress(accounts.getBranchAddress());
      return accountDto;
    }

    public static Accounts mapsToAccount(AccountDto accountDto, Accounts accounts) {
        accounts.setAccountNumber(accountDto.getAccountNumber());
        accounts.setAccountType(accountDto.getAccountType());
        accounts.setBranchAddress(accountDto.getBranchAddress());
        return accounts;
    }
}
