package com.cognizant.cde.action;

import org.apache.commons.io.FileUtils;
import java.security.Identity;

public class SampleFileSystemOperations {

    public void getTempDirectory() {
        FileUtils.getTempDirectory();
    }

}
