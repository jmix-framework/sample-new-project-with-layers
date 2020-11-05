package com.company.sample.ui.screens.main;

import com.company.sample.data.service.SampleService;
import io.jmix.ui.Notifications;
import io.jmix.ui.component.AppWorkArea;
import io.jmix.ui.component.Button;
import io.jmix.ui.component.Window;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Nullable;
import javax.inject.Inject;

@UiController("sample_MainScreen")
@UiDescriptor("sample-main-screen.xml")
public class SampleMainScreen extends Screen implements Window.HasWorkArea {

    @Inject
    private AppWorkArea workArea;

    @Autowired
    private SampleService sampleService;

    @Autowired
    private Notifications notifications;

    @Nullable
    @Override
    public AppWorkArea getWorkArea() {
        return workArea;
    }

    @Subscribe("sayHello")
    public void onSayHelloClick(Button.ClickEvent event) {
        notifications.create().withCaption(sampleService.echo("Hello")).show();
    }

}
