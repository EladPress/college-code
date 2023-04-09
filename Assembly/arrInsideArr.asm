; multi-segment executable file template.

data segment
    arr_B db 15, -7, 4, 3, -5, 0, 8, 5, 11
    arr_A db 3, -5, 0, 8, 5, 11
    v db ?
    p db ?
ends

stack segment
    dw   128  dup(0)
ends

code segment
    proc TEST
         mov p, -1
         xor bl, bl
   begin:inc bl
         cmp bl, 9
         jz end
         mov cl, [arr_B + bx]
         cmp v, cl
         jnz begin
         mov p,bl        
     end:ret
    endp TEST
    
    proc TEST2
        mov bl, [arr_A]
        mov v, bl 
        call TEST
        xor bx, bx
        mov bl, p
        mov cx, 5
        mov ax, 1
 begin2:inc bl
        inc di 
        mov dl, [arr_B + bx]
        mov dh, [arr_A + di]
        cmp dl, dh
        jnz false
        loop begin2
        jmp end2
  false:xor ax, ax    
   end2:mov bx, ax
        ret
    endp TEST2
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax
    
    
    call test2    
ends

end start ; set entry point and stop the assembler.
