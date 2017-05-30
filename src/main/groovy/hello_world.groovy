#!/usr/bin/env groovy

import groovy.util.logging.*
import org.apache.log4j.*

Logger log = Logger.getInstance(getClass())
log.level = Level.INFO

log.info('Groovy Version is: ' + GroovySystem.version)
log.info('Hello World!')
