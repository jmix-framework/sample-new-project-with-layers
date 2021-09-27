package com.company.sample.ui.security;

import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

@ResourceRole(name = "UI Full Access", code = UiFullAccessRole.CODE)
public interface UiFullAccessRole {

    String CODE = "ui-full-access";

    @ScreenPolicy(screenIds = "*")
    @MenuPolicy(menuIds = "*")
    void fullAccess();
}