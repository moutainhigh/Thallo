package com.yss.thallo.container;

import org.apache.hadoop.yarn.api.records.ContainerId;

public class DockerReporter extends ContainerReporter {

    public DockerReporter(ContainerId containerId) {
        super(containerId);
    }

    @Override
    public void updateProcessInfo() {

    }
}
