#!/bin/sh

cd /opt/app
if ! [ -f gradlew ]; then
  gradle wrapper --gradle-version 6.1.1
fi

tail -f /dev/null
