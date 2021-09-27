package com.company.qazaqninja;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> slots);
}
