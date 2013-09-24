LIBPATH=/Users/alangorton/CD/TheApp/lib/*
ROOTPATH=/Users/alangorton/CD/TheApp/src/main/java/com/develogical/*
WEBPATH=/Users/alangorton/CD/TheApp/src/main/java/com/develogical/web

echo ".:$LIBPATH"

javac -classpath ".:$ROOTPATH:$LIBPATH" com/develogical/WebServer.java
# javac -cp "$LIBPATH" com/develogical/web/*.java
# javac -cp "$LIBPATH" com/develogical/WebServer.java
