	.intel_syntax noprefix

	.global add

add:
	mov rax, rsi
	add rax, rdi
	ret
	
	.end
