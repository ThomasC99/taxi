 find -name "*.java" > sources
javac @sources
rm sources
find -name "*.class" > sources
jar -cfmv Main.jar Manifest.txt @sources
rm sources
