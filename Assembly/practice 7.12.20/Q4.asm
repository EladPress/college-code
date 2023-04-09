
; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt

org 100h

;if BL = BH then DL = 0, else DL = 0FFh

MOV BL, 57H
MOV BH, 58H
CMP BL, BH
MOV DL,0
JZ END
MOV DL, 0FFH

END: INT 3

ret




