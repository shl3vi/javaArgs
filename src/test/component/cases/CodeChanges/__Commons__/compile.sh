#!/bin/sh

rm -rf ./output

mkdir output

cd output
mkdir before
mkdir after

cd ..

cp sealights.json ./output/before
cp sealights.json ./output/after

/usr/bin/javac -d ./output/before ./before/*.java
/usr/bin/javac -d ./output/after ./after/*.java

cd output
cd before
/usr/bin/jar cvfe app.jar io.demo.Program *
cd ./../after
/usr/bin/jar cvfe app.jar io.demo.Program *