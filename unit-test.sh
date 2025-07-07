#!/bin/bash

echo "Running unit tests..."

mvn clean test

if [ $? -eq 0 ]; then
    echo "Unit tests passed."
else
    echo "Unit tests failed."
    exit 1
fi
