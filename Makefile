all: hello

hello:fact.cpp function.o division.o
 	g++ fact.o function.o division.o -o hello

fact.cpp:function.o
	g++ -c fact.cpp

function.o:function.cpp
	g++ -c function.cpp

division.o:division.cpp
	g++ -c division.cpp

clean:
	rm -rf *o hello

