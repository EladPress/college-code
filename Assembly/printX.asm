; multi-segment executable file template.

data segment
    ; add your data here!
    num dw ?
ends

stack segment
    dw   4  dup(0)
ends

code segment

proc printX
   
   
   mov cx, [num] 
   printloop: 
   mov dl, 'x'
   mov ah, 2h
   int 21h
   loop printloop
   ret

endp printX



start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    mov ax, 5
    mov [num], ax
    call printx
    
    
            
      
ends

end start ; set entry point and stop the assembler.
