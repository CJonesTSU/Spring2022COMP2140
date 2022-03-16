BUILD_DEPS:=spl.jar
RUN_DEPS:=${BUILD_DEPS}:out/

ifdef OS
	# Windows
	BUILD_DEPS:=${subst :,;,${BUILD_DEPS}}
	RUN_DEPS:=${subst :,;,${RUN_DEPS}}
endif

build_run: check_args build run

check_args:
ifeq ($(strip $(program)),)
	@echo "================================================="
	@echo "==== ERROR: You need to specify a program to run."
	@echo "==== Example: "
	@echo "====     make program=Add2Numbers"
	@echo "================================================="
	@exit 1
endif

build:
	@echo "==== Building the program:"
	javac -cp ${BUILD_DEPS} -d out/ *.java

run: check_args
	@echo "==== Launching the program:"
	java -cp ${RUN_DEPS} ${basename ${notdir ${program}}}



clean:
	rm -rf .idea/ out/
	rm -f *.iml
	rm -f *.class
