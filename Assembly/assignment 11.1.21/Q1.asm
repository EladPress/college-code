;print x a set number of times

data segment
    ; add your data here!
    
ends

stack segment
    dw   10  dup(0)
ends

code segment
    proc printx
        mov dx, 0
        pop bx
        pop cx
        sub dx, cx
        jns end
        printloop:
        mov dl, 'X'
        mov ah, 2h
        int 21h
        loop printloop
    end:push bx
        ret
    endp printx
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    mov ax, -66
    push ax
    call printx
    
    
    
    
    
ends

end start ; set entry point and stop the assembler.
