; multi-segment executable file template.

data segment
arr DB 1 dup(1, 2, 3, 6Ah, 5, 6, 7, 8, 9, 9Bh, 11, 12, 13, 14, 15, 16)
var1 db 0
ends

stack segment
    dw   128  dup(0)
ends

code segment
start: 
MOV CX, 10
MOV BX, DATA
MOV DS, BX
strt:
CMP [ARR + SI], 5Ah
JC END
INC [VAR1]
END: INC SI 
LOOP STRT
   
ends

end start ; set entry point and stop the assembler.
