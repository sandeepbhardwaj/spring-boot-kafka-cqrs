package com.koko.account.domain;

import com.koko.account.events.BaseEvent;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;


@Slf4j
public abstract class AggregateRoot {
    protected String id;
    private int version = -1;
    private final List<BaseEvent> changes = new ArrayList<>();

    public String getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public List<BaseEvent> getUncommittedChange() {
        return this.changes;
    }

    public void mockChangesAsCommited() {
        this.changes.clear();
    }

    protected void applyChanges(BaseEvent event, Boolean isNew) {

    }
}
