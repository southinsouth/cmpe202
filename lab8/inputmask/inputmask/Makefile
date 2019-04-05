all: clean

clean: 
	find . -name "*.class" -exec rm -rf {} \;
	rm -rf build/*

init:
	./gradlew init
	mkdir -p libs
	mkdir -p src/main/java
	mkdir -p src/test/java

compile:
	./gradlew build -x test --warning-mode all

test:
	./gradlew test

jar: compile
	./gradlew shadowJar

checkstyle:
	./gradlew check
	
spotbugs:
	./gradlew spotbugsMain

codesmells:
	./gradlew smartsmells

run: jar
	java -cp build/libs/inputmask-all.jar Main

