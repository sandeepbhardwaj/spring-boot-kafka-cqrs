package com.koko.account.commands.dispatcher;

import com.koko.account.commands.BaseCommand;

@FunctionalInterface
public interface CommandHandlerMethod<T extends BaseCommand> {
    void handle(T command);
}
