; print A if first num is bigger, B if the second is, and C if equal

data segment
    ; add your data here!
    pkey db "press any key...$"
ends

stack segment
    dw   128  dup(0)
ends

code segment
    
    proc print
        pop cx
        pop ax
        pop bx
        cmp ax, bx
        jnz notequal
        mov dl, 'C'
        jmp end
notequal: sub bx, ax
        js Abigger
        mov dl, 'B'
        jmp end
Abigger:mov dl, 'A'
    end:mov ah, 2h
        int 21h
        push cx
        ret
    endp print
    
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    mov ax, 12
    mov bx, 12
    push bx
    push ax
    call print
ends

end start ; set entry point and stop the assembler.
