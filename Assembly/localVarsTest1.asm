;local variables test1

data segment
    
ends

stack segment
    dw   128  dup(0)
    
    
ends

code segment
    proc test
        X equ [bp - 2]
        push bp
        mov bp, sp
        sub sp, 4
        mov ax, 34
        mov X, ax
        add sp, 4
        pop bp
        ret
    endp test
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    call test
    mov dl, al
   mov ah, 2h
   int 21h        
       
ends

end start ; set entry point and stop the assembler.
