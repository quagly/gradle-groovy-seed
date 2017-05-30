#!/bin/sh

# run just one test
# useful when focusing on one test issue and just want a quick single test
# change the name of test.single to whatever test name you wish to run

./gradlew -Dtest.single=ServerBasic test
