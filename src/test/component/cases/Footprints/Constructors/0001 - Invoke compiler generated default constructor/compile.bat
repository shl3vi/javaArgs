REM This will delete everything from the folder (and the folder itself).
IF EXIST output (
	rmdir output /s /q
)

md output
copy .\sealights.json .\output\sealights.json 

"%JAVA_HOME%\bin\javac" -d ./output *.java

cd output
"%JAVA_HOME%\bin\jar" cvfe app.jar io.demo.Program *


