;local vars test2

data segment
    
ends

stack segment
    dw   128  dup(0)
ends

code segment
    proc xyz 
        
        push bp
        mov bp, sp
        sub sp, 6
        localX equ -2
        localY equ -4
        localZ equ -6
        
        ;pop localX
        ;pop localY
        ;pop localZ
        mov ax, [bp + 4]
        mov [bp + localX], ax
        mov ax, [bp + 6]
        mov [bp + localY], ax
        mov ax, [bp + 8]
        mov [bp + localZ], ax
        add sp, 6  
        pop bp
        ret 6
    endp xyz
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    push 2
    push 4
    push 6
    call xyz  
ends

end start ; set entry point and stop the assembler.
