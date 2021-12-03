package com.koko.account.events;

import com.koko.account.model.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AccountOpenedEvent extends BaseEvent{
    private String accountHolder;
    private AccountType accountType;
    private Date createdDate;
    private double openingBalance;
}
