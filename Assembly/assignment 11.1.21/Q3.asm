;max and min of 4 numbers

data segment
    ; add your data here!
    c1 dw 43
    c2 dw 4
    c3 dw 12
    c4 dw 123
    max dw ?
    min dw ?
ends

stack segment
    dw   128  dup(0)
ends

code segment

proc MaxMin
    pop dx
    mov cx, 4
    mov [max], 0
    pop ax
    mov [min], ax
begin:
    mov bx, ax
    sub bx, [max]
    js step1
    mov [max],ax
step1:mov bx, ax
    sub bx, [min]
    jns loopinc
    mov [min], ax
loopinc: pop ax
    loop begin    
    
    push dx
    ret

endp MaxMin
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    push c1
    push c2
    push c3
    push c4
    call MaxMin  
ends

end start ; set entry point and stop the assembler.
