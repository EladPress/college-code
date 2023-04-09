; multi-segment executable file template.

data segment

ARR DB 1 DUP(8, 3, 6, 4, 5, 6, 12, 8, 9, 10, 11, 12, 13, 14, 15, 16)
EVEN DB 0
ODD DB 0
    
ends

stack segment
    dw   128  dup(0)
ends

code segment
start:

MOV BX, DATA
MOV DS, BX
MOV CX, 10h

STRT: 
ROR [ARR + SI], 1
JO END
INC [EVEN]
END:
INC SI
LOOP STRT
MOV BL, 10h
SUB BL, [EVEN]
MOV [ODD], BL
  
ends

end start ; set entry point and stop the assembler.
