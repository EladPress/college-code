; multi-segment executable file template.

data segment
    return dw ?
    arr dw 1 dup (3, 6, 1, 4, 5)
    address dw ?
    address2 dw ?
    n dw ?
    minindex dw ?
    currindex dw ?
    currCX dw ?
ends

stack segment
    dw   128  dup(0)
ends

code segment
    proc findmin
        pop address
        pop es
        pop si
        push bp
        mov bp, sp
        mov cx, 4
        sub sp, 2
        min equ -2
        mov dx, [word ptr es:si]
        mov [bp + min], dx
        add si,2
        mov minindex, si
loopstart:mov ax, [bp + min]
        sub ax, [word ptr es:si]
        js false
        mov dx, [word ptr es:si]
        mov [min + bp], dx
        mov minindex, si
  false:add si, 2
        loop loopstart
        mov ax, [min + bp] 
        pop bp
        push minindex
        push address
        ret
    endp findmin
    
    proc swap
        pop address
        pop es
        pop si
        pop di
        mov dx, [word ptr es:si]
        mov bx, [word ptr es:di]
        mov [word ptr es:si], bx
        mov [word ptr es:di], dx
        push address
        ret
    endp swap
    
    proc sortarray
        pop address2
        pop es
        pop si
        mov currindex, si
        pop n
        mov cx, 4
  step: push si
        push es
        mov currCX, cx
        call findmin
        mov cx, currCX
        mov si, currindex
        pop ax
        push si
        push ax
        push es
        call swap
        mov si, currindex
        add si, 2
        mov currindex, si
        loop step
        push address2
        ret
     endp sortarray
        
        
        
        
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax
    
    push 8
    push offset arr
    push ds
    call sortarray  
ends

end start ; set entry point and stop the assembler.
