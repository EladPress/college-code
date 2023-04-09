; gets array, moves sum to ax
data segment
    sum dw ?
    arr dw 1 dup(3,6,5,2,1)
    address dw ?
    return dw ?
ends

stack segment
    dw   128  dup(0)
ends

code segment
    proc findSum
        pop address
        pop es
        pop si
        mov ax, 0
        mov cx, 5
loopstart:add ax, [word ptr es:si]
        add si, 2
        loop loopstart
        push address
        
        ret
     endp findSum
        
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    mov sum, 0
    push sum
    push offset arr
    push ds
    call findSum 
ends

end start ; set entry point and stop the assembler.
