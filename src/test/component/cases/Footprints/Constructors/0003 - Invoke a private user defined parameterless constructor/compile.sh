#!/bin/sh

rm -rf ./output

mkdir output
cp sealights.json ./output

/usr/bin/javac -d ./output *.java

cd output
/usr/bin/jar cvfe app.jar io.demo.Program *
