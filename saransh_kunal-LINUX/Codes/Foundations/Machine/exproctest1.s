	.include "console.i"

	.extern add

	.start main

main:	
	GetInt ask
	mov rdi, rax
	GetInt ask
	mov rsi, rax

	call add
	
	PutInt tell

	ret

ask:	.string "Enter the Positive Integer:"
tell:	.string "The addition of two number is = "

	.end
