package com.citytechinc.cqlibrary.bundlestatusplugin

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

interface BundleStatusChecker {

    void checkStatus(bundleSymbolicName) throws MojoExecutionException, MojoFailureException
}
