//Assembly Code

.include "console.i"

.start entry

entry: putmsg greet ##output message at memory location identified by greet label
	putmsg greet1
	ret

greet: .string "Hello\n"
greet1: .string "Welcome to Assembly Language\n"
 
.end
