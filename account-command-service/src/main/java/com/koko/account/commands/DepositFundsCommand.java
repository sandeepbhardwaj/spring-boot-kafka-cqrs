package com.koko.account.commands;

import lombok.Data;

@Data
public class DepositFundsCommand extends BaseCommand{
    private double amount;
}
