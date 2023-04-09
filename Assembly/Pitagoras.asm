; checks pitagoras

data segment
    ; add your data here!
    X dw 3
    Y dw 4
    Z dw 5
ends

stack segment
    dw   128  dup(0)
ends

code segment
    proc Pitagoras
        push bp
        mov bp, sp
        
        mov ax, [bp + 4]
        mul ax
        mov cl, al
        mov ax, [bp + 6]
        mul ax
        mov bl, al
        mov ax, [bp + 8]
        mul ax
        mov bh, al
        add bl, bh
        mov ax, 0
        cmp bl, cl
        jnz jumpPoint
        inc ax
jumpPoint:pop bp
        ret
        
    endp Pitagoras
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    ;mov X, 3
    ;mov bl, [X]
    ;push bl
    ;mov Y,4
    ;mov bl, [y]
    ;push bl
    ;mov bl, [Z]
    ;push bl 
    push X
    push Y
    push Z
    call Pitagoras 
    ;inc ax  
ends

end start ; set entry point and stop the assembler.
