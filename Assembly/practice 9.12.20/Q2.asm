; multi-segment executable file template.

data segment
    var1 db 5
    var2 db 4
    sum db 0
ends

stack segment
    dw   128  dup(0)
ends

code segment
start:

mov bx, data
mov ds, bx

mov cx, 0
mov cl, [var2]
mov al, [var1]

strt: 
add ah, al

loop strt

mov [sum], ah
   
ends

end start ; set entry point and stop the assembler.
