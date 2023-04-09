; multi-segment executable file template.

data segment
    arr db 1, 4, 6, 9, 10, 19, 35, 7, 1, 9 
    low db ?
    high db ?
    
ends

stack segment
    dw   128  dup(0)
ends

code segment
    proc check
        mov ah, 1
        mov dl, high
        inc dl
        xor bx, bx
        xor cx, cx
        mov bl, low
        mov cl, [arr + bx]
  begin:inc bx
        cmp bl, dl
        jz end
        sub cl, [arr + bx]
        jns false
        mov cl, [arr + bx]
        jmp begin
  false:mov ah, 0 
    end:ret 
    endp check
    
    proc check2
        mov low, 0
        mov high, 4
 begin2:cmp high, 10
        jz end
        call check
        cmp ah, 1
        jz end2
        inc high
        inc low
        jmp begin2
   end2:ret
     endp check2
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    
    call check2
       
ends

end start ; set entry point and stop the assembler.
