package com.koko.account.commands.dispatcher;

import com.koko.account.commands.BaseCommand;

public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);

    void send(BaseCommand command);
}
