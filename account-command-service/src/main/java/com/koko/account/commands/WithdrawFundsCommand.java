package com.koko.account.commands;

import lombok.Data;

@Data
public class WithdrawFundsCommand extends BaseCommand{
    private double amount;
}
