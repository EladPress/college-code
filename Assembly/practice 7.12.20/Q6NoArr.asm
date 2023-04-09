
; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt

org 100h

I DD 0
MOV BX, 300H
START: CMP I,15H
JZ END
MOV DI, 30H + I
MOV SI, I
MOV AX, [BX + SI]
MOV [BX + DI], AX
INC I

JMP START

END: INT 3
ret




