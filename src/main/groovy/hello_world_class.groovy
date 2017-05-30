#!/usr/bin/env groovy

import groovy.util.logging.*
import org.apache.log4j.*
import com.cambiahealth.utils.HelloWorld

Logger log = Logger.getInstance(getClass())
log.level = Level.INFO
log.info('Groovy Version is: ' + GroovySystem.version)

helloDefault = new HelloWorld()

log.info(helloDefault.tellIt)

helloCustom = new HelloWorld( tellIt:'Goodbye cruel world!' )

log.info(helloCustom.tellIt)
