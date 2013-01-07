package com.citytechinc.maven.plugins.osgibundlestatus.checker

import org.apache.maven.plugin.MojoExecutionException
import org.apache.maven.plugin.MojoFailureException

interface BundleStatusChecker {

    void checkStatus(bundleSymbolicName) throws MojoExecutionException, MojoFailureException
}