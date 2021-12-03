package com.koko.account.commands;

import com.koko.account.model.AccountType;
import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand{
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
}
