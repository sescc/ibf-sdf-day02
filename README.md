1. compile (slide 8)
javac --source-path src -d bin src\*

2. run (slide 9)
java -cp bin App

3. package into jar (slide 12)
jar -c -v -f day02.jar -e App .     // do inside bin folder

4. run .jar
java -cp bin/day02.jar App      // run in project root
java -cp day02.jar App          // run in bin folder