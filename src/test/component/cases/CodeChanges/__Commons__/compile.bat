REM This will delete everything from the folder (and the folder itself).
IF EXIST output (
	rmdir output /s /q
)

md output

cd output
md before
md after

cd ..

copy .\sealights.json .\output\before\sealights.json 
copy .\sealights.json .\output\after\sealights.json 

"%JAVA_HOME%\bin\javac" -d ./output/before ./before/*.java
"%JAVA_HOME%\bin\javac" -d ./output/after ./after/*.java

cd output
cd before
"%JAVA_HOME%\bin\jar" cvfe app.jar io.demo.Program *
cd ..\after
"%JAVA_HOME%\bin\jar" cvfe app.jar io.demo.Program *


